package com.UD20.ejercicios.Ex3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex3 extends JFrame {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel vecesB1;
	private JLabel vecesB2;
	private JButton boton1;
	private JButton boton2;
	private int contador1 = 0;
	private int contador2 = 0;

	public Ex3() {
		//CONTENEDOR
		setTitle("Ejercicio 3");
		setBounds(400, 20, 235, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Texto
		vecesB1 = new JLabel("Botón 1:");
		vecesB1.setBounds(10, 45, 164, 14);
		contentPane.add(vecesB1);
		
		vecesB2 = new JLabel("Botón 2:");
		vecesB2.setBounds(10, 67, 164, 14);
		contentPane.add(vecesB2);
		
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
				contador1++;
				vecesB1.setText("Botón 1: " + contador1 + " veces.");
			}		
		};
		boton1.addActionListener(al1);
		
		//Al pulsar el botón 2...
		ActionListener al2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contador2++;
				vecesB2.setText("Botón 2: " + contador2 + " veces.");
			}		
		};
		boton2.addActionListener(al2);
		
	}
}
