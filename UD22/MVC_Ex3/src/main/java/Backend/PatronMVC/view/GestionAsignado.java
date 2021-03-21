package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dto.AsignadoA;
import Backend.PatronMVC.model.dto.Cientifico;
import Backend.PatronMVC.model.dto.Proyecto;

import java.awt.event.ActionListener;

public class GestionAsignado extends JFrame implements ActionListener {
	//Declarar componentes
	Controller controlador;
	private JPanel contentPane;
	private JLabel textoDniCientifico;
	private JTextField dniCientifico;
	private JLabel textoIdProyecto;
	private JTextField idProyecto;
	private JButton btnCancelar;
	private JButton btnBuscar;
	private JButton btnAñadir;
	private JButton btnEliminar;

	public GestionAsignado() {
		//CONTENEDOR
		setTitle("Proyectos asignados a los científicos");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 149);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JLabel DNI del científico
		textoDniCientifico = new JLabel("DNI del científico:");
		textoDniCientifico.setBounds(10, 25, 99, 14);
		contentPane.add(textoDniCientifico);
		
		//TextField DNI del científico
		dniCientifico = new JTextField();
		dniCientifico.setBounds(101, 22, 86, 20);
		contentPane.add(dniCientifico);
		dniCientifico.setColumns(10);
		
		//JLabel Id del proyecto
		textoIdProyecto = new JLabel("Id del proyecto:");
		textoIdProyecto.setBounds(197, 25, 94, 14);
		contentPane.add(textoIdProyecto);
		
		//TextField Id del proyecto
		idProyecto = new JTextField();
		idProyecto.setBounds(301, 22, 86, 20);
		contentPane.add(idProyecto);
		idProyecto.setColumns(10);
		
		//Botones
		btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(10, 70, 86, 23);
		contentPane.add(btnAñadir);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(106, 70, 86, 23);
		contentPane.add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(202, 70, 86, 23);
		contentPane.add(btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(298, 70, 86, 23);
		contentPane.add(btnCancelar);
		
		//ActionListeners
		btnAñadir.addActionListener(this);
		btnBuscar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnCancelar.addActionListener(this);
	}

		//Set del controlador
		public void setControlador(Controller controlador) {
			this.controlador = controlador;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAñadir) {
			try {
				AsignadoA asignado = new AsignadoA();
				asignado.setCientifico(dniCientifico.getText());
				asignado.setProyecto(idProyecto.getText());
			
				this.controlador.añadirAsignadoA(asignado);	
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
		if (e.getSource()==btnCancelar){
			this.dispose();
		}
		
		if(e.getSource() == btnEliminar) {
			this.controlador.eliminarAsignadoA(this.dniCientifico.getText());
		}	

		if(e.getSource() == btnBuscar) {
			try {
				mostrarDatos(this.controlador.buscarAsignadoA(this.dniCientifico.getText()));
			}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
		}
		private void mostrarDatos(AsignadoA asignado) {
			dniCientifico.setText(asignado.getCientifico());
			idProyecto.setText(asignado.getProyecto());	
		}
}