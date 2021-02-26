package Ex3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Miniencuesta extends JFrame {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel sistemaOperativo;
	private JRadioButton SO_1;
	private JRadioButton SO_2;
	private JRadioButton SO_3;
	private JLabel especialidad;
	private JCheckBox especialidades_1;
	private JCheckBox especialidades_2;
	private JCheckBox especialidades_3;
	private JLabel horasOrdenador;
	private JSlider horas;
	private JButton enviar;
	
	//Constructor
	public Miniencuesta() {
		//CONTENEDOR
		setTitle("Miniencuesta");
		setBounds(400, 20, 630, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Texto.
		sistemaOperativo = new JLabel("Elije un sistema operativo:");
		sistemaOperativo.setBounds(21, 34, 149, 14);
		contentPane.add(sistemaOperativo);
		
		//Opciones Sistema Operativo.
		SO_1 = new JRadioButton("Windows");
		SO_1.setBounds(21, 55, 109, 23);
		contentPane.add(SO_1);
		
		SO_2 = new JRadioButton("Linux");
		SO_2.setBounds(21, 81, 109, 23);
		contentPane.add(SO_2);
		
		SO_3 = new JRadioButton("Max");
		SO_3.setBounds(21, 107, 109, 23);
		contentPane.add(SO_3);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(SO_1);
		bgroup.add(SO_2);
		bgroup.add(SO_3);
		
		
		//Texto.
		especialidad = new JLabel("Elije tu especialidad:");
		especialidad.setBounds(187, 34, 143, 14);
		contentPane.add(especialidad);
		
		//Opciones Especialidad.
		especialidades_1 = new JCheckBox("Programación");
		especialidades_1.setBounds(187, 55, 128, 23);
		contentPane.add(especialidades_1);
		
		especialidades_2 = new JCheckBox("Diseño gráfico");
		especialidades_2.setBounds(187, 81, 128, 23);
		contentPane.add(especialidades_2);
		
		especialidades_3 = new JCheckBox("Administración");
		especialidades_3.setBounds(187, 107, 128, 23);
		contentPane.add(especialidades_3);
		
		//Texto.
		horasOrdenador = new JLabel("Horas dedicadas en el ordenador?");
		horasOrdenador.setBounds(340, 34, 213, 14);
		contentPane.add(horasOrdenador);
		
		//Slider.
		horas = new JSlider(0, 10);
		horas.setBounds(322, 55, 200, 49);
		horas.setPaintTicks(true); //las rayitas que marcan los números
		horas.setMajorTickSpacing(1); // de cuanto en cuanto los números en el slider
		horas.setMinorTickSpacing(1); //las rayitas de cuanto en cuanto
		horas.setPaintLabels(true); 
		contentPane.add(horas);
		
		//Botón para enviar la encuesta.
		enviar = new JButton("Enviar");
		enviar.setBounds(378, 115, 89, 23);
		contentPane.add(enviar);
		
		//Al pulsar el botón mostrará los resultados.
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Mostrar SO seleccionado.
				if(SO_1.isSelected()) {
					JOptionPane.showMessageDialog(null, "El Sistema Operativo seleccionado és: Windows");
				}
				else if (SO_2.isSelected()) {
					JOptionPane.showMessageDialog(null, "El Sistema Operativo seleccionado és: Linux");
				}
				else {
					JOptionPane.showMessageDialog(null, "El Sistema Operativo seleccionado és: Mac");
				}
				//Mostrar especialidades seleccionadas.
				if (especialidades_1.isSelected()) {
					if (especialidades_2.isSelected()) {
						if (especialidades_3.isSelected()) {
							JOptionPane.showMessageDialog(null, "Las especialidades seleccionadas són: Programación,"
									+ " Diseño gráfico y Administración.");
						}
						else {
							JOptionPane.showMessageDialog(null, "Las especialidades seleccionadas són: Programación y"
									+ " Diseño gráfico.");
						}
					}
					else {
						if (especialidades_3.isSelected()) {
							JOptionPane.showMessageDialog(null, "Las especialidades seleccionadas són: Programación"
									+ " y Administración.");
						}
						else {
							JOptionPane.showMessageDialog(null, "Las especialidades seleccionadas són: Programación.");
						}
					}
				}
				else {
					if (especialidades_2.isSelected()) {
						if (especialidades_3.isSelected()) {
							JOptionPane.showMessageDialog(null, "Las especialidades seleccionadas són: Diseño gráfico"
									+ " y Administración.");
						}
						else {
							JOptionPane.showMessageDialog(null, "Las especialidades seleccionadas són: Diseño gráfico.");
						}
					}
					else {
						if (especialidades_3.isSelected()) {
							JOptionPane.showMessageDialog(null, "Las especialidades seleccionadas són: Administración.");
						}
					}
				}
				//Mostrar horas en el ordenador.
				JOptionPane.showMessageDialog(null, "Pasas " + horas.getValue() + " horas en el ordenador.");
			}
		};
		enviar.addActionListener(al);
}
}