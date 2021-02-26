package Ex4;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel numero1;
	private JTextField operando1;
	private JLabel numero2;
	private JTextField operando2;
	private JLabel resultado;
	private JTextField mostrarResultado;
	private JButton suma;
	private JButton resta;
	private JButton multiplicacion;
	private JButton division;
	private JButton btAbout;
	private JButton btSalir;

	
	//Constructor
		public Calculadora() {
			//CONTENEDOR
			setTitle("MiniCalculadora");
			setBounds(400, 20, 385, 305);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
			//PANEL
			contentPane = new JPanel();
			contentPane.setLayout(null);
			setContentPane(contentPane);
			
			//COMPONENTES
			//Texto.
			numero1 = new JLabel ("Introduce el primer número:");
			numero1.setBounds(10, 11, 190, 23);
			contentPane.add(numero1);
			
			//Campo de texto para guardar el primer número.
			operando1 = new JTextField();
			operando1.setBounds(10, 35, 134, 20);
			contentPane.add(operando1);
			operando1.setColumns(10);
			
			//Texto.
			numero2 = new JLabel("Introduce el segundo número:");
			numero2.setBounds(10, 66, 190, 14);
			contentPane.add(numero2);
			
			//Campo de texto para guardar el segundo número.
			operando2 = new JTextField();
			operando2.setBounds(10, 86, 134, 20);
			contentPane.add(operando2);
			operando2.setColumns(10);
			
			//Texto.
			resultado = new JLabel("Resultado:");
			resultado.setBounds(10, 117, 190, 14);
			contentPane.add(resultado);
			
			//Campo de texto para mostrar el resultado.
			mostrarResultado = new JTextField();
			mostrarResultado.setBounds(10, 136, 134, 20);
			contentPane.add(mostrarResultado);
			mostrarResultado.setColumns(10);
			
			//Botones.
			suma = new JButton("Sumar");
			suma.setBounds(210, 22, 122, 23);
			contentPane.add(suma);
			
			resta = new JButton("Restar");
			resta.setBounds(210, 54, 122, 23);
			contentPane.add(resta);
			
			multiplicacion = new JButton("Multiplicación");
			multiplicacion.setBounds(210, 87, 122, 23);
			contentPane.add(multiplicacion);
			
			division = new JButton("División");
			division.setBounds(210, 121, 122, 23);
			contentPane.add(division);
			
			btAbout = new JButton("About");
			btAbout.setBounds(10, 177, 89, 23);
			contentPane.add(btAbout);
			
			btSalir = new JButton("Salir");
			btSalir.setBounds(10, 214, 89, 23);
			contentPane.add(btSalir);
			
			//Listeners
			//Sumar.
			ActionListener sumar = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//Pasamos los valores de los JTextField a Integer.
					int num1 = Integer.parseInt(operando1.getText());
					int num2 = Integer.parseInt(operando2.getText());
					
					//Los sumamos y guardamos el resultado en la variable suma.
					int suma = num1 + num2;
					
					//Lo volvemos a convertir en un String.
					String resultado = suma + "";
					
					//Mostramos la suma en el JTextField resultado.
					mostrarResultado.setText(resultado);
				}
				
			};
			suma.addActionListener(sumar);
			
			//Restar.
			ActionListener restar = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//Pasamos los valores de los JTextField a Integer.
					int num1 = Integer.parseInt(operando1.getText());
					int num2 = Integer.parseInt(operando2.getText());
					
					//Los sumamos y guardamos el resultado en la variable suma.
					int resta = num1 - num2;
					
					//Lo volvemos a convertir en un String.
					String resultado = resta + "";
					
					//Mostramos la suma en el JTextField resultado.
					mostrarResultado.setText(resultado);
					
				}
			};
			resta.addActionListener(restar);
		
			//Multiplicar.
			ActionListener multiplicar = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//Pasamos los valores de los JTextField a Integer.
					int num1 = Integer.parseInt(operando1.getText());
					int num2 = Integer.parseInt(operando2.getText());
					
					//Los sumamos y guardamos el resultado en la variable suma.
					int multiplicacion = num1 * num2;
					
					//Lo volvemos a convertir en un String.
					String resultado = multiplicacion + "";
					
					//Mostramos la suma en el JTextField resultado.
					mostrarResultado.setText(resultado);
					
				}
			};
			multiplicacion.addActionListener(multiplicar);
		
			//Dividir.
			ActionListener dividir = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//Pasamos los valores de los JTextField a Integer.
					int num1 = Integer.parseInt(operando1.getText());
					int num2 = Integer.parseInt(operando2.getText());
					
					//Los sumamos y guardamos el resultado en la variable suma.
					int division = num1 / num2;
					
					//Lo volvemos a convertir en un String.
					String resultado = division + "";
					
					//Mostramos la suma en el JTextField resultado.
					mostrarResultado.setText(resultado);
					
				}
			};
			division.addActionListener(dividir);
			
			//About.
			ActionListener about = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			};
			btAbout.addActionListener(about);
			
			//Salir.
			ActionListener salir = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
			        // Se pide una confirmación antes de finalizar el programa
					int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres cerrar la aplicación?",
						"Confirmación de cierre", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE);
					if (option == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			};
			btSalir.addActionListener(salir);
		
		}
}