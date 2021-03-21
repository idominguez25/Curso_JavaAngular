package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dto.Cientifico;
import Backend.PatronMVC.model.dto.Proyecto;
import jdk.internal.org.jline.reader.Parser.ParseContext;

public class GestionProyectos extends JFrame implements ActionListener {
	//Declarar componentes
	private Controller controlador;
	private JPanel contentPane;
	private JLabel textoID;
	private JTextField id;
	private JLabel textoNombre;
	private JTextField nombre;
	private JLabel textoHoras;
	private JTextField horas;
	private JButton btnAñadirProyecto,btnBuscarProyecto,btnEliminarProyecto, btnCancelar;


		public GestionProyectos() {
			//CONTENEDOR
			setTitle("Gestión de los proyectos");
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setBounds(100, 100, 496, 149);
			
			//PANEL
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			//JLabel id
			textoID = new JLabel("Id:");
			textoID.setBounds(10, 25, 36, 14);
			contentPane.add(textoID);
			
			//TextField id
			id = new JTextField();
			id.setBounds(46, 22, 71, 20);
			contentPane.add(id);
			id.setColumns(10);
			
			//JLabel Nombre
			textoNombre = new JLabel("Nombre:");
			textoNombre.setBounds(129, 25, 78, 14);
			contentPane.add(textoNombre);
			
			//TextField Nombre
			nombre = new JTextField();
			nombre.setBounds(182, 22, 116, 20);
			contentPane.add(nombre);
			nombre.setColumns(10);
			
			//JLabel Horas
			textoHoras = new JLabel("Horas:");
			textoHoras.setBounds(308, 25, 45, 14);
			contentPane.add(textoHoras);
			
			//TextField horas
			horas = new JTextField();
			horas.setBounds(349, 22, 97, 20);
			contentPane.add(horas);
			horas.setColumns(10);
			
			//Botones
			btnAñadirProyecto = new JButton("Añadir");
			btnAñadirProyecto.setBounds(55, 64, 86, 23);
			contentPane.add(btnAñadirProyecto);
			
			btnBuscarProyecto = new JButton("Buscar");
			btnBuscarProyecto.setBounds(151, 64, 86, 23);
			contentPane.add(btnBuscarProyecto);
			
			btnEliminarProyecto = new JButton("Eliminar");
			btnEliminarProyecto.setBounds(247, 64, 86, 23);
			contentPane.add(btnEliminarProyecto);
			
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(343, 64, 86, 23);
			contentPane.add(btnCancelar);
			
			//ActionListeners
			btnAñadirProyecto.addActionListener(this);
			btnBuscarProyecto.addActionListener(this);
			btnEliminarProyecto.addActionListener(this);
			btnCancelar.addActionListener(this);
		}

		//Set del controlador
		public void setControlador(Controller controlador) {
			this.controlador = controlador;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAñadirProyecto)
		{
			try {
				Proyecto proyecto = new Proyecto();
				proyecto.setId(id.getText());
				proyecto.setNombre(nombre.getText());
				proyecto.setHoras(Integer.parseInt(horas.getText()));
			
				this.controlador.añadirProyecto(proyecto);	
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
		if (e.getSource()==btnCancelar){
			this.dispose();
		}
		
		if(e.getSource() == btnEliminarProyecto) {
			this.controlador.eliminarProyecto(this.id.getText());
		}	

		if(e.getSource() == btnBuscarProyecto) {
			try {
				mostrarProyecto(this.controlador.buscarProyecto(this.id.getText()));
			}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
}
		private void mostrarProyecto(Proyecto proyecto) {
			id.setText(proyecto.getId());
			nombre.setText(proyecto.getNombre());
			horas.setText(String.valueOf(proyecto.getHoras()));			
		}
}