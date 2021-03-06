package com.UD20.ejercicios.Ex5;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex5 extends JFrame {
	//Declarar componentes
	private JPanel contentPane;
	private JButton boton;
	private JTextArea texto;
	private JScrollPane scroll;

	public Ex5() {
		//CONTENEDOR
		setTitle("Ejercicio 5");
		setBounds(400, 20, 319, 269);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Botón
		boton = new JButton("Limpiar");
		boton.setBounds(0, 0, 303, 28);
		contentPane.add(boton);
		
		//TextArea
		texto = new JTextArea();
		texto.setBounds(1, 1, 301, 229);
		contentPane.add(texto);
		
		//Scroll
		scroll = new JScrollPane(texto);
		scroll.setBounds(0, 28, 303, 202);
		contentPane.add(scroll);
		
		//Imprimimos las acciones que haga el ratón
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				texto.append("El ratón ha hecho click.\n");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				texto.append("El ratón ha entrado.\n");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				texto.append("El ratón ha salido.\n");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				texto.append("El ratón está presionado.\n");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				texto.append("El ratón ya no está presionado.\n");
			}
		});
		
		//Al pulsar el botón...
		ActionListener al1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				texto.setText("");
			}		
		};
		boton.addActionListener(al1);
	}
}
