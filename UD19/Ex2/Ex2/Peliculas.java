package Ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Peliculas extends JFrame {
	//Atributos
	private JPanel contentPane;
	private JLabel introducirPelicula;
	private JTextField nombrePelicula;
	private JButton a�adir;
	private JLabel peliculas;
	private JComboBox lista;
	
	//Constructor
	public Peliculas() {
		//CONTENEDOR
		setTitle("Peliculas");
		setBounds(400, 20, 500, 180);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Texto.
		introducirPelicula = new JLabel("Escribe el t�tulo de una pel�cula:");
		introducirPelicula.setHorizontalAlignment(SwingConstants.CENTER);
		introducirPelicula.setBounds(20, 30, 200, 20);
		contentPane.add(introducirPelicula);
		
		//Campo de texto para introducir el nombre de la pel�cula.
		nombrePelicula = new JTextField();
		nombrePelicula.setBounds(30, 61, 200, 20);
		contentPane.add(nombrePelicula);
		
		//Bot�n para guardar la pel�cula.
		a�adir = new JButton("A�adir");
		a�adir.setBounds(78, 92, 90, 23);
		contentPane.add(a�adir);
		
		//Texto.
		peliculas = new JLabel("Pel�culas");
		peliculas.setBounds(321, 33, 70, 20);
		contentPane.add(peliculas);
		
		//Desplegable con los nombres de las pel�culas que introducimos.
		lista = new JComboBox<>();
		lista.setBounds(246, 61, 200, 20);
		contentPane.add(lista);
		
		//Evento que se producir� cuando se pulse el bot�n
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Acciones
				lista.addItem(nombrePelicula.getText());
			}
		};
		a�adir.addActionListener(al);

	}
}