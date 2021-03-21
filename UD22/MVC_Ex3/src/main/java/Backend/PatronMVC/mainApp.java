package Backend.PatronMVC;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.service.AsignadoA_Serv;
import Backend.PatronMVC.model.service.CientificoServ;
import Backend.PatronMVC.model.service.ProyectoServ;
import Backend.PatronMVC.view.GestionCientificos;
import Backend.PatronMVC.view.GestionProyectos;
import Backend.PatronMVC.view.GestionAsignado;
import Backend.PatronMVC.view.Principal;

public class mainApp {

	CientificoServ cientificoServ;
	ProyectoServ proyectoServ;
	AsignadoA_Serv asignadoA_Serv;
	Principal principal;
	GestionCientificos gestionCientificos;
	GestionProyectos gestionProyectos;
	GestionAsignado gestionAsignado;
	Controller controller;
	
	public static void main(String[] args) {
		mainApp app = new mainApp();
		app.iniciar();
	}

	private void iniciar() {
		/*Se instancian las clases*/
		principal = new Principal();
		gestionCientificos=new GestionCientificos();
		gestionProyectos=new GestionProyectos();
		gestionAsignado= new GestionAsignado();
		controller= new Controller();
		cientificoServ = new CientificoServ();
		proyectoServ = new ProyectoServ();
		asignadoA_Serv = new AsignadoA_Serv();
		
		/*Se establecen las relaciones entre clases*/
		principal.setControlador(controller);
		gestionCientificos.setControlador(controller);
		gestionProyectos.setControlador(controller);
		gestionAsignado.setControlador(controller);
		cientificoServ.setControlador(controller);
		proyectoServ.setControlador(controller);
		
		/*Se establecen relaciones con la clase coordinador*/
		controller.setPrincipal(principal);
		controller.setGestionCientificos(gestionCientificos);
		controller.setGestionProyectos(gestionProyectos);
		controller.setGestionAsignado(gestionAsignado);
		controller.setCientificoService(cientificoServ);
		controller.setProyectoService(proyectoServ);
		controller.setAsignadoService(asignadoA_Serv);
				
		principal.setVisible(true);
	}

}