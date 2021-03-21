package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dto.Cliente;

public class BuscarCliente extends JFrame implements ActionListener {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel buscarCliente;
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
	private JButton btnBuscar;
	private JButton btnCancelar;

	private Controller personaController;
	
	private static final long serialVersionUID = 1L;
	
		public BuscarCliente() {
		//CONTENEDOR
		setTitle("BuscarCliente registros");
		setBounds(400, 20, 392, 260);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Texto registrar cliente.
		buscarCliente = new JLabel("BUSCAR CLIENTE");
		buscarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		buscarCliente.setBounds(95, 11, 207, 14);
		contentPane.add(buscarCliente);
		
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
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(95, 143, 89, 23);
		contentPane.add(btnBuscar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(194, 143, 89, 23);
		contentPane.add(btnCancelar);
		
		//ActionListener
		btnBuscar.addActionListener(this);
		btnCancelar.addActionListener(this);

		limpiar();
}
		public void setCoordinador(Controller personacontroller) {
		this.personaController = personacontroller;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
				if(e.getSource() == btnBuscar) {
					try {
						mostrarCliente(this.personaController.buscarCliente(this.id.getText()));
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
						System.out.println(ex);
					}
				}
				if (e.getSource()==btnCancelar)	{
					this.dispose();
				}
		}
			
		private void mostrarCliente(Cliente cliente) {
			nombre.setText(cliente.getNombre());
			apellido.setText(cliente.getApellido());
			direccion.setText(cliente.getDireccion());
			DNI.setText(cliente.getDNI() +"");
			fecha.setText(cliente.getFecha());
		}


		//Permite limpiar los campos
		public void limpiar()
		{
			id.setText("");
			nombre.setText("");
			apellido.setText("");
			direccion.setText("");
			DNI.setText("");
			fecha.setText("");
		}
}