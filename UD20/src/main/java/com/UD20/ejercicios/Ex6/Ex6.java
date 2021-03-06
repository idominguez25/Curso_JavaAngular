package com.UD20.ejercicios.Ex6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex6 extends JFrame {
	//Declarar components
	private JPanel contentPane;
	private JLabel altura;
	private JTextField textoA;
	private JLabel peso;
	private JTextField textoP;
	private JButton boton;
	private JLabel IMC;
	private JTextField textoIMC;


	public Ex6() {
		//CONTENEDOR
		setTitle("Ejercicio 2");
		setBounds(400, 20, 296, 209);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Texto Altura
		altura = new JLabel("Altura (metros):");
		altura.setBounds(10, 11, 95, 14);
		contentPane.add(altura);
		
		//TextField Altura
		textoA = new JTextField();
		textoA.setBounds(118, 8, 119, 20);
		contentPane.add(textoA);
		textoA.setColumns(10);
		
		//Texto Peso
		peso = new JLabel("Peso (Kg):");
		peso.setBounds(10, 41, 95, 14);
		contentPane.add(peso);
		
		//TextField Peso
		textoP = new JTextField();
		textoP.setBounds(118, 39, 119, 20);
		contentPane.add(textoP);
		textoP.setColumns(10);
		
		//Texto IMC
		IMC = new JLabel("IMC:");
		IMC.setBounds(10, 72, 95, 14);
		contentPane.add(IMC);
		
		//TextField IMC
		textoIMC = new JTextField();
		textoIMC.setBounds(118, 70, 119, 20);
		contentPane.add(textoIMC);
		textoIMC.setColumns(10);
		
		//Boton
		boton = new JButton("Calcular IMC");
		boton.setBounds(10, 110, 260, 23);
		contentPane.add(boton);
		
		//Al pulsar el botón...
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double peso = Double.parseDouble(textoP.getText());
				double altura = Double.parseDouble(textoA.getText());
				double IMC = peso / (altura * altura);
				
				String resultado = String.format("%6.2f", IMC);
				
				textoIMC.setText(resultado);
				
			}
		};
		boton.addActionListener(al);
		
	}
}
