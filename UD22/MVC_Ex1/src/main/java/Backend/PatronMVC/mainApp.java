package Backend.PatronMVC;

import Backend.PatronMVC.controller.ClienteController;
import Backend.PatronMVC.model.conexion.Conexion;
import Backend.PatronMVC.model.service.ClienteServ;
import Backend.PatronMVC.view.Añadir;
import Backend.PatronMVC.view.Buscar;
import Backend.PatronMVC.view.Principal;

public class mainApp {
		ClienteServ mipersonaServ;
		Principal principal;
		Buscar ventanaBuscar;
		Añadir ventanaAñadir;
		ClienteController personaController;

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			mainApp programa = new mainApp();
			programa.iniciar();
			Conexion conexion = new Conexion();

		}

		/**
		 * Permite instanciar todas las clases con las que trabaja
		 * el sistema
		 */
		private void iniciar() {
			/*Se instancian las clases*/
			principal = new Principal();
			ventanaAñadir=new Añadir();
			ventanaBuscar= new Buscar();
			mipersonaServ=new ClienteServ();
			personaController= new ClienteController();
			
			/*Se establecen las relaciones entre clases*/
			principal.setCoordinador(personaController);
			ventanaAñadir.setCoordinador(personaController);
			ventanaBuscar.setCoordinador(personaController);
			mipersonaServ.setClienteController(personaController);
			
			/*Se establecen relaciones con la clase coordinador*/
			personaController.setVentanaPrincipal(principal);
			personaController.setBuscarRegistro(ventanaBuscar);
			personaController.setAñadirRegistros(ventanaAñadir);
			personaController.setPersonaServ(mipersonaServ);
					
			principal.setVisible(true);
		}

	}