package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dto.Cientifico;

public class GestionCientificos extends JFrame implements ActionListener {
	//Declarar componentes
	private Controller controlador;
	private JPanel contentPane;
	private JLabel textoDNI;
	private JTextField DNI;
	private JLabel textoNomApels;
	private JTextField nomApels;
	private JButton btnAñadirCientifico,btnBuscarCientifico,btnEliminarCientifico, btnCancelar;


		public GestionCientificos() {
			//CONTENEDOR
			setTitle("Gestión de los científicos");
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setBounds(100, 100, 413, 149);
			
			//PANEL
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			//JLabel DNI
			textoDNI = new JLabel("DNI:");
			textoDNI.setBounds(10, 25, 132, 14);
			contentPane.add(textoDNI);
			
			//TextField DNI
			DNI = new JTextField();
			DNI.setBounds(46, 22, 86, 20);
			contentPane.add(DNI);
			DNI.setColumns(10);
			
			//JLabel NomApels
			textoNomApels = new JLabel("Nombre y apellido:");
			textoNomApels.setBounds(152, 25, 124, 14);
			contentPane.add(textoNomApels);
			
			//TextField NomApels
			nomApels = new JTextField();
			nomApels.setBounds(255, 22, 132, 20);
			contentPane.add(nomApels);
			nomApels.setColumns(10);
			
			//Botones
			btnAñadirCientifico = new JButton("Añadir");
			btnAñadirCientifico.setBounds(10, 70, 86, 23);
			contentPane.add(btnAñadirCientifico);
			
			btnBuscarCientifico = new JButton("Buscar");
			btnBuscarCientifico.setBounds(106, 70, 86, 23);
			contentPane.add(btnBuscarCientifico);
			
			btnEliminarCientifico = new JButton("Eliminar");
			btnEliminarCientifico.setBounds(202, 70, 86, 23);
			contentPane.add(btnEliminarCientifico);
			
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(298, 70, 86, 23);
			contentPane.add(btnCancelar);
			
			//ActionListeners
			btnAñadirCientifico.addActionListener(this);
			btnBuscarCientifico.addActionListener(this);
			btnEliminarCientifico.addActionListener(this);
			btnCancelar.addActionListener(this);
		}

		//Set del controlador
		public void setControlador(Controller controlador) {
			this.controlador = controlador;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAñadirCientifico)
		{
			try {
				Cientifico cientifico = new Cientifico();
				cientifico.setDni(DNI.getText());
				cientifico.setNomApels(nomApels.getText());
			
				this.controlador.añadirCientifico(cientifico);	
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
		if (e.getSource()==btnCancelar){
			this.dispose();
		}
		
		if(e.getSource() == btnEliminarCientifico) {
			this.controlador.eliminarCientifico(this.DNI.getText());
		}	

		if(e.getSource() == btnBuscarCientifico) {
			try {
				mostrarCientifico(this.controlador.buscarCientifico(this.DNI.getText()));
			}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
}

		private void mostrarCientifico(Cientifico cientifico) {
			DNI.setText(cientifico.getDNI());
			nomApels.setText(cientifico.getNomApels());
			
		}
}