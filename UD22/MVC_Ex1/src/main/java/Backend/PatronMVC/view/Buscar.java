package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Backend.PatronMVC.controller.ClienteController;
import Backend.PatronMVC.model.dto.Cliente;
import Backend.PatronMVC.model.service.ClienteServ;

public class Buscar extends JFrame implements ActionListener {
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
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private ClienteController PersonaController;
	private Backend.PatronMVC.controller.ClienteController personaController;
	
	private static final long serialVersionUID = 1L;
	
		public Buscar() {
		//CONTENEDOR
		setTitle("Buscar registros");
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
		buscarCliente.setBounds(121, 11, 126, 14);
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
		btnBuscar.setBounds(48, 143, 89, 23);
		contentPane.add(btnBuscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(149, 143, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(248, 143, 89, 23);
		contentPane.add(btnEliminar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(98, 177, 89, 23);
		contentPane.add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(197, 177, 89, 23);
		contentPane.add(btnCancelar);
		
		//ActionListener
		btnBuscar.addActionListener(this);
		btnModificar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnGuardar.addActionListener(this);
		btnCancelar.addActionListener(this);

		limpiar();
}
		public void setCoordinador(ClienteController personacontroller) {
		this.personaController = personacontroller;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource()==btnGuardar){
				try {
					Cliente cliente = new Cliente();
					cliente.setId(Integer.parseInt(id.getText()));
					cliente.setNombre(nombre.getText());
					cliente.setApellido(apellido.getText());
					cliente.setDireccion(direccion.getText());
					cliente.setDNI(Integer.parseInt(DNI.getText()));
					cliente.setFecha(fecha.getText());

					personaController.modificarCliente(cliente);
					
					if (ClienteServ.modificaPersona==true) {
						//habilita(true, false, false, false, false, false, true, true, true, false, true);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
				
				if(e.getSource() == btnBuscar) {
					try {
						mostrarCliente(this.personaController.buscarCliente(this.id.getText()));
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
						System.out.println(ex);
					}
				}
			
			if (e.getSource()==btnModificar)
			{
				//habilita(true, true, true, true, true, true, true, true, true, true, true);
				
			}
			
			if (e.getSource()==btnEliminar)
			{
				if (!textoId.getText().equals(""))
				{
					int respuesta = JOptionPane.showConfirmDialog(this,
							"Esta seguro de eliminar la Persona?", "Confirmación",
							JOptionPane.YES_NO_OPTION);
					if (respuesta == JOptionPane.YES_NO_OPTION)
					{
						PersonaController.eliminarCliente(textoId.getText());
						limpiar();
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "Ingrese un numero de Documento", "Información",JOptionPane.WARNING_MESSAGE);
				}
				
			}
			if (e.getSource()==btnCancelar)
			{
				this.dispose();
			}

		}
		/**
		 * permite cargar los datos de la persona consultada
		 * @param miPersona
		 */
		private void mostrarCliente(Cliente cliente) {
			nombre.setText(cliente.getNombre());
			apellido.setText(cliente.getApellido());
			direccion.setText(cliente.getDireccion());
			DNI.setText(cliente.getDNI() +"");
			fecha.setText(cliente.getFecha());
			//habilita(false, true, true, true, true, true, true, true, true, false, true);
		}


		/**
		 * Permite limpiar los componentes
		 */
		public void limpiar()
		{
			id.setText("");
			nombre.setText("");
			apellido.setText("");
			direccion.setText("");
			DNI.setText("");
			fecha.setText("");
			//habilita(true, false, false, false, false, false, true, false, false, true, true);
		}
		
		//public void habilita(boolean id1, boolean nombre1, boolean apellido1, boolean direccion1, boolean DNI1, boolean fecha1, boolean bBuscar, boolean bModificar, boolean bEliminar, boolean bGuardar, boolean bCancelar)
		//{
		//	id.setEditable(id1);
			//nombre.setEditable(nombre1);
			//apellido.setEditable(apellido1);
			//direccion.setEditable(direccion1);
			//DNI.setEditable(DNI1);
			//fecha.setEditable(fecha1);
			//btnBuscar.setEnabled(bBuscar);
			//btnModificar.setEnabled(bModificar);
			//btnEliminar.setEnabled(bEliminar);
			//btnGuardar.setEnabled(bGuardar);
			//btnCancelar.setEnabled(bCancelar);
		//}
}