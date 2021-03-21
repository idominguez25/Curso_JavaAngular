package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dto.Cliente;

public class InsertarCliente extends JFrame implements ActionListener {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel registrarCliente;
	private JLabel textoId;
	private JTextField id;
	private JLabel textoNombre;
	private JTextField nombre;
	private JLabel textoApellido;
	private JTextField apellido;
	private JLabel textoDireccion;
	private JTextField direccion;
	private JLabel textoDNI;
	private JTextField DNI;
	private JLabel textoFecha;
	private JTextField fecha;
	private JButton btnAñadir;
	private JButton btnCancelar;
	private Controller PersonaController;

	public InsertarCliente() {
	//CONTENEDOR
	setTitle("Insertar cliente");
	setBounds(400, 20, 404, 235);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	//PANEL
	contentPane = new JPanel();
	contentPane.setLayout(null);
	setContentPane(contentPane);
	
	//COMPONENTES
	//Texto registrar cliente.
	registrarCliente = new JLabel("REGISTRAR CLIENTE");
	registrarCliente.setBounds(141, 11, 126, 14);
	contentPane.add(registrarCliente);
	
	//Texto id.
	textoId = new JLabel("Id:");
	textoId.setBounds(10, 49, 46, 14);
	contentPane.add(textoId);
	
	//TextField id.
	id = new JTextField();
	id.setBounds(74, 46, 110, 20);
	contentPane.add(id);
	id.setColumns(10);
	
	//Texto nombre.
	textoNombre = new JLabel("Nombre:");
	textoNombre.setBounds(10, 77, 46, 14);
	contentPane.add(textoNombre);
	
	//TextField nombre.
	nombre = new JTextField();
	nombre.setBounds(74, 71, 110, 20);
	contentPane.add(nombre);
	nombre.setColumns(10);
	
	//Texto apellido.
	textoApellido = new JLabel("Apellido:");
	textoApellido.setBounds(10, 108, 46, 14);
	contentPane.add(textoApellido);
	
	//TextField apellido.
	apellido = new JTextField();
	apellido.setBounds(74, 102, 110, 20);
	contentPane.add(apellido);
	apellido.setColumns(10);
	
	//Texto dirección.
	textoDireccion = new JLabel("Dirección:");
	textoDireccion.setBounds(194, 49, 64, 14);
	contentPane.add(textoDireccion);
	
	//TextField dirección.
	direccion = new JTextField();
	direccion.setColumns(10);
	direccion.setBounds(258, 46, 110, 20);
	contentPane.add(direccion);
	
	//Texto DNI.
	textoDNI = new JLabel("DNI:");
	textoDNI.setBounds(194, 77, 46, 14);
	contentPane.add(textoDNI);
	
	//TextField DNI.
	DNI = new JTextField();
	DNI.setColumns(10);
	DNI.setBounds(258, 71, 110, 20);
	contentPane.add(DNI);
	
	//Texto fecha.
	textoFecha = new JLabel("Fecha:");
	textoFecha.setBounds(194, 108, 46, 14);
	contentPane.add(textoFecha);
	
	//TextField fecha.
	fecha = new JTextField();
	fecha.setColumns(10);
	fecha.setBounds(258, 102, 110, 20);
	contentPane.add(fecha);
	
	//Botones
	btnAñadir = new JButton("Insertar");
	btnAñadir.setBounds(87, 147, 89, 23);
	contentPane.add(btnAñadir);
	
	btnCancelar = new JButton("Cancelar");
	btnCancelar.setBounds(186, 147, 89, 23);
	contentPane.add(btnCancelar);
	
	//ActionListener
	btnAñadir.addActionListener(this);
	btnCancelar.addActionListener(this);
	
	//Llamamos al método limpiar.
	limpiar();
	}
	
	//Método para borrar lo que hemos introducido. 
	private void limpiar() {
		id.setText("");
		nombre.setText("");
		apellido.setText("");
		direccion.setText("");
		DNI.setText("");
		fecha.setText("");
	}
	
	//
	public void setCoordinador(Controller personaController) {
		this.PersonaController = personaController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAñadir){
			try {
				Cliente cliente = new Cliente();
				cliente.setId(Integer.parseInt(id.getText()));
				cliente.setNombre(nombre.getText());
				cliente.setApellido(apellido.getText());
				cliente.setDireccion(direccion.getText());
				cliente.setDNI(Integer.parseInt(DNI.getText()));
				cliente.setFecha((fecha.getText()));
				
				this.PersonaController.insertarCliente(cliente);	
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
		
		if (e.getSource()==btnCancelar)
		{
			this.dispose();
		}
	}
}
