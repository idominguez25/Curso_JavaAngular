package Backend.PatronMVC.view;

import javax.swing.*;

import Backend.PatronMVC.controller.ClienteController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame implements ActionListener {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel texto;
	private JButton btnAñadir;
	private JButton btnBuscar;
	private ClienteController PersonaController;

	//Constructor
	public Principal() {
		//CONTENEDOR
		setTitle("Ventana Principal");
		setBounds(400, 20, 361, 129);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Text
		texto = new JLabel("¿Qué quieres hacer?");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(57, 11, 219, 14);
		contentPane.add(texto);
		
		//Botones
		btnAñadir = new JButton("Añadir registro");
		btnAñadir.setBounds(45, 36, 129, 23);
		contentPane.add(btnAñadir);
		btnAñadir.addActionListener(this);
		
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(184, 36, 129, 23);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(this);
	}

	public void setCoordinador(ClienteController personaController) {
		this.PersonaController=personaController;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAñadir) {
			PersonaController.mostrarVentanaAñadir();			
		}
		if (e.getSource()==btnBuscar) {
			PersonaController.mostrarVentanaBuscar();			
		}
	}
}

