package Backend.PatronMVC;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.service.ClienteServ;
import Backend.PatronMVC.model.service.VideoServ;
import Backend.PatronMVC.view.BuscarCliente;
import Backend.PatronMVC.view.BuscarVideo;
import Backend.PatronMVC.view.InsertarCliente;
import Backend.PatronMVC.view.InsertarVideo;
import Backend.PatronMVC.view.Principal;

public class mainApp {

	ClienteServ clienteServ;
	VideoServ videoServ;
	Principal principal;
	BuscarCliente buscarCliente;
	BuscarVideo buscarVideo;
	InsertarCliente insertarCliente;
	InsertarVideo insertarVideo;
	Controller controller;
	
	public static void main(String[] args) {
		mainApp app = new mainApp();
		app.iniciar();
	}

	private void iniciar() {
		/*Se instancian las clases*/
		principal = new Principal();
		insertarCliente=new InsertarCliente();
		insertarVideo=new InsertarVideo();
		buscarCliente= new BuscarCliente();
		buscarVideo= new BuscarVideo();
		clienteServ =new ClienteServ();
		videoServ =new VideoServ();
		controller= new Controller();
		
		/*Se establecen las relaciones entre clases*/
		principal.setCoordinador(controller);
		insertarCliente.setCoordinador(controller);
		insertarVideo.setCoordinador(controller);
		buscarCliente.setCoordinador(controller);
		buscarVideo.setCoordinador(controller);
		clienteServ.setController(controller);
		
		/*Se establecen relaciones con la clase coordinador*/
		controller.setVentanaPrincipal(principal);
		controller.setInsertarCliente(insertarCliente);
		controller.setInsertarVideo(insertarVideo);
		controller.setBuscarCliente(buscarCliente);
		controller.setBuscarVideo(buscarVideo);
		controller.setClienteServ(clienteServ);
		controller.setVideoServ(videoServ);
				
		principal.setVisible(true);
	}

}