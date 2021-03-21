package Backend.PatronMVC.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import Backend.PatronMVC.controller.Controller;

import javax.swing.border.BevelBorder;

public class Principal extends JFrame implements ActionListener {
	//Atributos
	private static final long serialVersionUID = 1L;
	private Controller controller;
	private JPanel contentPane;
	private JLabel titulo;
	private JButton btnInsertarCliente, btnBuscarCliente, btnBuscarVideo,btnInsertarVideo;

	public Principal() {
		//CONTENEDOR
		setTitle("Ventana principal");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 227);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//COMPONENTES
		//JLabel título
		titulo = new JLabel("¿Qué quieres hacer?");
		titulo.setBounds(71, 11, 140, 19);
		contentPane.add(titulo);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		//Botones
		btnInsertarCliente = new JButton("Insertar cliente");
		btnInsertarCliente.setBounds(10, 59, 139, 23);
		contentPane.add(btnInsertarCliente);
				
		btnBuscarCliente = new JButton("Buscar cliente");
		btnBuscarCliente.setBounds(159, 59, 117, 23);
		contentPane.add(btnBuscarCliente);
						
		btnInsertarVideo = new JButton("Insertar video");
		btnInsertarVideo.setBounds(10, 93, 139, 23);
		contentPane.add(btnInsertarVideo);
								
	    btnBuscarVideo = new JButton("Buscar video");
	    btnBuscarVideo.setBounds(159, 93, 117, 23);
		contentPane.add(btnBuscarVideo);
		btnBuscarVideo.addActionListener(this);
	
		
		//ActionListener
		btnInsertarCliente.addActionListener(this);
		btnBuscarCliente.addActionListener(this);
		btnBuscarVideo.addActionListener(this);
		btnInsertarVideo.addActionListener(this);
		
	}
	
	//Set del controller
	public void setCoordinador(Controller controller) {
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInsertarCliente)
			this.controller.showInsertarCliente();
		if (e.getSource() == btnBuscarCliente)
			this.controller.showBuscarCliente();
		if (e.getSource() == btnBuscarVideo)
			this.controller.showBuscarVideo();
		if (e.getSource() == btnInsertarVideo)
			this.controller.showInsertarVideo();
	}
}