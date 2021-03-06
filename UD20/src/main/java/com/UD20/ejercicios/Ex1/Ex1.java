package com.UD20.ejercicios.Ex1;

import javax.swing.*;

public class Ex1 extends JFrame {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel texto;

	public Ex1() {
		//CONTENEDOR
		setTitle("Ejercicio 1");
		setBounds(400, 20, 233, 157);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		texto = new JLabel("Ejercio 1 de la UD20");
		texto.setBounds(47, 44, 141, 14);
		contentPane.add(texto);
		
	
	}
}
