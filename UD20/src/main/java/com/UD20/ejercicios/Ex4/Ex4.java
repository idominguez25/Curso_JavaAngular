package com.UD20.ejercicios.Ex4;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex4 extends JFrame {
	//Declarar componentes
	private JPanel contentPane;
	private JLabel texto;
	private JTextArea eventos;

	public Ex4() {
		//CONTENEDOR
		setTitle("Ejercicio 4");
		setBounds(400, 20, 352, 243);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Etiqueta
		texto = new JLabel("Eventos:");
		texto.setBounds(10, 80, 75, 14);
		contentPane.add(texto);
		
		//TextArea		
		eventos = new JTextArea();
		eventos.setBounds(95, 30, 231, 146);
		contentPane.add(eventos);
		
		//Imprimimos los eventos de la ventana
		addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
            	eventos.append("Ventana abierta\n");
            }
            @Override
    		public void windowClosing(WindowEvent e) {
    			eventos.append("Ventana cerrándose\n");
    		}
            @Override
    		public void windowClosed(WindowEvent e) {
    			eventos.append("Ventana cerrada\n");
    		}
        	@Override
    		public void windowIconified(WindowEvent e) {
    			eventos.append("Ventana iconizada\n");
    		}
        	@Override
    		public void windowDeiconified(WindowEvent e) {
    			eventos.append("Ventana desiconizada\n");
    		}
            @Override
            public void windowDeactivated(WindowEvent e) {
            	eventos.append("Ventana desactivada\n");
            }
			@Override
			public void windowActivated(WindowEvent e) {
				eventos.append("Ventana activada\n");
			}
        });
	}
}
