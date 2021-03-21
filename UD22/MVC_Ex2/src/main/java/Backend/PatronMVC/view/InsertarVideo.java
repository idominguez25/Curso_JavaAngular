package Backend.PatronMVC.view;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dto.Video;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InsertarVideo extends JFrame implements ActionListener{
	//Declarar componentes
		private JPanel contentPane;
		private JLabel registrarVideo;
		private JLabel textoId;
		private JTextField id;
		private JLabel textoTitulo;
		private JTextField titulo;
		private JLabel textoDirector;
		private JTextField director;
		private JLabel texto_idCliente;
		private JTextField idCliente;
		private JButton btnAñadir;
		private JButton btnCancelar;
		private Controller PersonaController;

		public InsertarVideo() {
		//CONTENEDOR
		setTitle("Insertar");
		setBounds(400, 20, 408, 185);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//PANEL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//COMPONENTES
		//Texto registrar cliente.
		registrarVideo = new JLabel("REGISTRAR VIDEO");
		registrarVideo.setBounds(141, 11, 126, 14);
		contentPane.add(registrarVideo);
		
		//Texto id.
		textoId = new JLabel("Id:");
		textoId.setBounds(10, 49, 46, 14);
		contentPane.add(textoId);
		
		//TextField id.
		id = new JTextField();
		id.setBounds(55, 46, 110, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		//Texto titulo.
		textoTitulo = new JLabel("Título:");
		textoTitulo.setBounds(10, 77, 46, 14);
		contentPane.add(textoTitulo);
		
		//TextField titulo.
		titulo = new JTextField();
		titulo.setBounds(55, 74, 110, 20);
		contentPane.add(titulo);
		titulo.setColumns(10);
		
		//Texto director.
		textoDirector = new JLabel("Director:");
		textoDirector.setBounds(178, 49, 46, 14);
		contentPane.add(textoDirector);
		
		//TextField director.
		director = new JTextField();
		director.setBounds(258, 43, 110, 20);
		contentPane.add(director);
		director.setColumns(10);
		
		//Texto idCliente.
		texto_idCliente = new JLabel("Id del cliente:");
		texto_idCliente.setBounds(179, 77, 110, 14);
		contentPane.add(texto_idCliente);
		
		//TextField idCliente.
		idCliente = new JTextField();
		idCliente.setColumns(10);
		idCliente.setBounds(258, 74, 110, 20);
		contentPane.add(idCliente);
		
		//Botones
		btnAñadir = new JButton("InsertarCliente");
		btnAñadir.setBounds(101, 105, 89, 23);
		contentPane.add(btnAñadir);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(200, 105, 89, 23);
		contentPane.add(btnCancelar);
		
		//ActionListener
		btnAñadir.addActionListener(this);
		btnCancelar.addActionListener(this);
		}
		
		public void setCoordinador(Controller personaController) {
			this.PersonaController = personaController;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==btnAñadir)
			{
				try {
					Video video = new Video();
					video.setId(Integer.parseInt(id.getText()));
					video.setTitulo(titulo.getText());
					video.setDirector(director.getText());
					video.setId_cliente(Integer.parseInt(idCliente.getText()));
					
					
					this.PersonaController.insertarVideo(video);	
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
					System.out.println(ex);
				}
			}
			if (e.getSource()==btnCancelar)	{
				this.dispose();
			}
		}
	}