import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludo extends JFrame {
	//Atributos
	private JPanel contentPane;
	private JLabel nombre;
	private JTextField respuesta;
	private JButton btnSaludar;
	
	//Constructor por defecto
	public Saludo() {
	//Título de la ventana.
	setTitle("Saludador");
	
	//Coordenadas, altura y longitud.
	setBounds(400, 20, 370, 300);
	
	//Indicamos que cuando se cierre la ventana se acaba la aplicación.
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	//Hacemos visible la ventana.
	setVisible(true);
	
	//Creamos el panel.
	contentPane = new JPanel();
	
	//Indicamos su diseño.
	contentPane.setLayout(null);
	
	//Asignamos el panel a la ventana.
	setContentPane(contentPane);
	
	//COMPONENTES
	//Preguntamos el nombre.
	nombre =  new JLabel ("Escribe tu nombre:");
	nombre.setHorizontalAlignment(SwingConstants.CENTER);
	nombre.setBounds(102, 31, 150, 20);
	contentPane.add(nombre);

	//Campo de texto para introducir el nombre.
	respuesta = new JTextField();
	respuesta.setBounds(79, 62, 200, 20);
	contentPane.add(respuesta);
	
	//Botón
	btnSaludar = new JButton("Saluda!");
	btnSaludar.setBounds(130, 93, 90, 23);
	contentPane.add(btnSaludar);
	
	//Cuando pulsemos el botón nos aparecerá este mensaje
	ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "¡Hola " + respuesta.getText() + "!");
		}
	};
	btnSaludar.addActionListener(al);
	}
}

