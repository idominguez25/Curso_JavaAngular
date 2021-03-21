package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dto.Video;

	public class BuscarVideo extends JFrame implements ActionListener{
		//Declarar componentes
		private JPanel contentPane;
		private JLabel buscarVideo;
		private JLabel textoId;
		private JTextField id;
		private JLabel textoTitulo;
		private JTextField titulo;
		private JLabel textoDirector;
		private JTextField director;
		private JLabel texto_idCliente;
		private JTextField idCliente;
		private JButton btnBuscar;
		private JButton btnCancelar;

		private Controller personaController;
		
		private static final long serialVersionUID = 1L;
		
			public BuscarVideo() {
			//CONTENEDOR
			setTitle("Buscar video");
			setBounds(400, 20, 392, 200);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			
			//PANEL
			contentPane = new JPanel();
			contentPane.setLayout(null);
			setContentPane(contentPane);
			
			//COMPONENTES
			//Texto registrar cliente.
			buscarVideo = new JLabel("BUSCAR VIDEO");
			buscarVideo.setHorizontalAlignment(SwingConstants.CENTER);
			buscarVideo.setBounds(121, 11, 126, 14);
			contentPane.add(buscarVideo);
			
			//Texto id.
			textoId = new JLabel("Id:");
			textoId.setBounds(10, 49, 46, 14);
			contentPane.add(textoId);
			
			//TextField id.
			id = new JTextField();
			id.setBounds(74, 46, 110, 20);
			contentPane.add(id);
			id.setColumns(10);
			
			//Texto titulo.
			textoTitulo = new JLabel("Título:");
			textoTitulo.setBounds(10, 77, 46, 14);
			contentPane.add(textoTitulo);
			
			//TextField titulo.
			titulo = new JTextField();
			titulo.setBounds(74, 71, 110, 20);
			contentPane.add(titulo);
			titulo.setColumns(10);
			
			//Texto director.
			textoDirector = new JLabel("Director:");
			textoDirector.setBounds(194, 49, 64, 14);
			contentPane.add(textoDirector);
			
			//TextField dirección.
			director = new JTextField();
			director.setColumns(10);
			director.setBounds(258, 46, 110, 20);
			contentPane.add(director);
			
			//Texto idCliente.
			texto_idCliente = new JLabel("Cliente:");
			texto_idCliente.setBounds(194, 77, 46, 14);
			contentPane.add(texto_idCliente);
			
			//TextField idCliente.
			idCliente = new JTextField();
			idCliente.setColumns(10);
			idCliente.setBounds(258, 71, 110, 20);
			contentPane.add(idCliente);
		
			//Botones
			btnBuscar = new JButton("Buscar");
			btnBuscar.setBounds(97, 111, 89, 23);
			contentPane.add(btnBuscar);
			
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(196, 111, 89, 23);
			contentPane.add(btnCancelar);
			
			//ActionListener
			btnBuscar.addActionListener(this);
			btnCancelar.addActionListener(this);

			limpiar();
	}
			public void setCoordinador(Controller personacontroller) {
			this.personaController = personacontroller;
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					if(e.getSource() == btnBuscar) {
						try {
							mostrarVideo(this.personaController.buscarVideo(this.id.getText()));
						}
						catch (Exception ex) {
							JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
							System.out.println(ex);
						}
					}
					if (e.getSource()==btnCancelar)	{
						this.dispose();
					}
			}
				
			private void mostrarVideo(Video video) {
				titulo.setText(video.getTitulo());
				director.setText(video.getDirector());
				idCliente.setText(video.getId_cliente() +"");
			}


			//Permite limpiar los campos
			public void limpiar() {
				id.setText("");
				titulo.setText("");
				director.setText("");
				idCliente.setText("");
			}
	}