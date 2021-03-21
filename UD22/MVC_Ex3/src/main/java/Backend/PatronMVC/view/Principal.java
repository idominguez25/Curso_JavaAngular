package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import Backend.PatronMVC.controller.Controller;

public class Principal extends JFrame implements ActionListener {
	//Atributos
	private Controller controlador;
	private JPanel contentPane;
	private JLabel titulo;
	private JButton btnGestionCientificos;
	private JButton btnGestionProyectos;
	private JButton btnGestionAsignarA;

	
	public Principal() {
		//CONTENEDOR
		setTitle("Ventana principal");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 138);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JLabel titulo
		titulo = new JLabel("¿Qué quieres hacer?");
		titulo.setBounds(166, 11, 132, 14);
		contentPane.add(titulo);
		
		//Botones
		btnGestionCientificos = new JButton("Gestionar científicos");
		btnGestionCientificos.setBounds(41, 36, 168, 23);
		contentPane.add(btnGestionCientificos);
		
		btnGestionProyectos = new JButton("Gestionar proyectos");
		btnGestionProyectos.setBounds(219, 36, 168, 23);
		contentPane.add(btnGestionProyectos);
		
		btnGestionAsignarA = new JButton("Gestionar asignar proyectos");
		btnGestionAsignarA.setBounds(107, 70, 210, 23);
		contentPane.add(btnGestionAsignarA);
		
		//ActionListener
		btnGestionCientificos.addActionListener(this);
		btnGestionProyectos.addActionListener(this);
		btnGestionAsignarA.addActionListener(this);
	}
	
	//Set del controller
	public void setControlador(Controller controller) {
		this.controlador = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnGestionCientificos)
			this.controlador.showAñadirCientifico();
		if(e.getSource() == btnGestionProyectos)
			this.controlador.showAñadirProyecto();
		if(e.getSource() == btnGestionAsignarA)
			this.controlador.showAsignarProyectoCientifico();
	}
}