
/*
 * Esta parte del patrón es la que define la lógica de administración del sistema, 
 * establece la conexión entre la vista y el modelo.
 */

package Backend.PatronMVC.controller;

import Backend.PatronMVC.model.dto.Cliente;
import Backend.PatronMVC.model.service.ClienteServ;
import Backend.PatronMVC.view.Añadir;
import Backend.PatronMVC.view.Buscar;
import Backend.PatronMVC.view.Principal;

public class ClienteController {
	//Atributos
	private Principal ventanaPrincipal;
	private Añadir añadirRegistros;
	private Buscar buscarRegistro;
	private ClienteServ personaServ;
	
	//Getters y setters
	public Principal getVentanaPrincipal() {
		return ventanaPrincipal;
	}
	
	public void setVentanaPrincipal(Principal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
	
	public Añadir getAñadirRegistros() {
		return añadirRegistros;
	}
	
	public void setAñadirRegistros(Añadir añadirRegistros) {
		this.añadirRegistros = añadirRegistros;
	}
	
	public Buscar getBuscarRegistro() {
		return buscarRegistro;
	}
	
	public void setBuscarRegistro(Buscar buscarRegistro) {
		this.buscarRegistro = buscarRegistro;
	}
	public ClienteServ getPersonaServ() {
		return personaServ;
	}
	public void setPersonaServ(ClienteServ personaServ) {
		this.personaServ = personaServ;
	}

	//Hace visible las vistas de Registro y Consulta
		public void mostrarVentanaAñadir() {
			añadirRegistros.setVisible(true);
		}
		public void mostrarVentanaBuscar() {
			buscarRegistro.setVisible(true);
		}
	
	//Llamadas a los metodos CRUD de la capa service para validar los datos de las vistas
	public void registrarCliente(Cliente cliente) {
		this.personaServ.validarRegistro(cliente);
	}
		
	public Cliente buscarCliente(String idCliente) {
		return ClienteServ.validarConsulta(idCliente);
	}
	
	public void modificarCliente(Cliente cliente) {
		this.personaServ.validarModificacion(cliente);
	}
	
	public void eliminarCliente(String idCliente) {
		this.personaServ.validarEliminacion(idCliente);
	}
	}
