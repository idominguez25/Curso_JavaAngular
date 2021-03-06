package com.UD20.ejercicios.Ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex2 extends JFrame {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel botonPulsado;
	private JButton boton1;
	private JButton boton2;

	public Ex2() {
		//CONTENEDOR
		setTitle("Ejercicio 2");
		setBounds(400, 20, 242, 141);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Texto
		botonPulsado = new JLabel("Pulsa un botón.");
		botonPulsado.setBounds(46, 56, 141, 14);
		contentPane.add(botonPulsado);
		
		//Botones
		boton1 = new JButton("Botón 1");
		boton1.setBounds(10, 11, 89, 23);
		contentPane.add(boton1);
		
		boton2 = new JButton("Botón 2");
		boton2.setBounds(109, 11, 89, 23);
		contentPane.add(boton2);
		
		//Al pulsar el botón 1...
		ActionListener al1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				botonPulsado.setText("Has pulsado: " + boton1.getText());
			}		
		};
		boton1.addActionListener(al1);
		
		//Al pulsar el botón 2...
		ActionListener al2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				botonPulsado.setText("Has pulsado: " + boton2.getText());
			}
			
		};
		boton2.addActionListener(al2);
		
	}

}
