package com.UD20.ejercicios.Ex8;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class Ex8 extends JFrame {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel textoC;
	private JTextField cantidad;
	private JLabel textoR;
	private JTextField resultado;
	private JButton boton;
	private JButton cambiar;
	private JButton borrar;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	private double resultadoCambio;
	private boolean tipoCambio = true;
	private final double CAMBIO_PESETAS_EUROS = 166.386;
	
		
		public Ex8() {
		//CONTENEDOR
		setTitle("Ejercicio 8");
		setBounds(400, 20, 460, 165);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Texto cantidad
		textoC = new JLabel("Cantidad a convertir:");
		textoC.setBounds(10, 11, 117, 14);
		contentPane.add(textoC);
		
		//TextField cantidad
		cantidad = new JTextField();
		cantidad.setBounds(137, 8, 86, 20);
		contentPane.add(cantidad);
		cantidad.setColumns(10);
		
		//Texto resultado
		textoR = new JLabel("Resultado:");
		textoR.setBounds(10, 36, 117, 14);
		contentPane.add(textoR);
		
		//TextField resultado
		resultado = new JTextField();
		resultado.setBounds(137, 33, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		//Botones
		boton = new JButton("De pesetas a euros");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Si tipoCambio es true (de pesetas a euros) se mostrará el resultado del cálculo en el TextField resultado.
				if (tipoCambio) {
					resultadoCambio = Double.parseDouble(cantidad.getText()) / CAMBIO_PESETAS_EUROS;
					resultado.setText(String.valueOf(df.format(resultadoCambio)));
				}
				//Si no, calculará el cambio de euros a pesetas.
				else {
					resultadoCambio = Double.parseDouble(cantidad.getText()) * CAMBIO_PESETAS_EUROS;
					resultado.setText(String.valueOf(df.format(resultadoCambio)));
				}
			}
		});
		boton.setBounds(260, 7, 154, 23);
		contentPane.add(boton);
		
		cambiar = new JButton("Cambiar");
		cambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Método para indicar si queremos pasar de euros a pesetas o viceversa.
				if (tipoCambio) {
					tipoCambio = false;
					boton.setText("De euros a pesetas");
				}
				else {
					tipoCambio = true;
					boton.setText("De pesetas a euros");
				}
			}
		});
		cambiar.setBounds(260, 42, 154, 23);
		contentPane.add(cambiar);
		
		borrar = new JButton("Borrar");
		borrar.addActionListener(new ActionListener() {
			//Cuando se pulse el botón se borrará el texto de los dos TextFields.
			public void actionPerformed(ActionEvent e) {
				cantidad.setText("");
				resultado.setText("");
			}
		});
		borrar.setBounds(260, 76, 154, 23);
		contentPane.add(borrar);
	
	}
}
