
/*
 * Esta parte del patrón es la que define la lógica de administración del sistema, 
 * establece la conexión entre la vista y el modelo.
 */

package Backend.PatronMVC.controller;

import java.util.LinkedList;

import Backend.PatronMVC.model.dto.AsignadoA;
import Backend.PatronMVC.model.dto.Cientifico;
import Backend.PatronMVC.model.dto.Proyecto;
import Backend.PatronMVC.model.service.AsignadoA_Serv;
import Backend.PatronMVC.model.service.CientificoServ;
import Backend.PatronMVC.model.service.ProyectoServ;
import Backend.PatronMVC.view.GestionAsignado;
import Backend.PatronMVC.view.GestionCientificos;
import Backend.PatronMVC.view.GestionProyectos;
import Backend.PatronMVC.view.Principal;

public class Controller {
	
	//Clases services
	private AsignadoA_Serv asignadoService;
	private CientificoServ cientificoService;
	private ProyectoServ proyectoService;

	//Interfaz
	private Principal principal;
	private GestionCientificos gestionCientificos;
	private GestionProyectos gestionProyectos;
	private GestionAsignado gestionAsignado;

	//Getters y Setters 
	public AsignadoA_Serv getAsignadoService() {
		return asignadoService;
	}

	public void setAsignadoService(AsignadoA_Serv asignadoService) {
		this.asignadoService = asignadoService;
	}

	public CientificoServ getCientificoService() {
		return cientificoService;
	}
	
	public void setCientificoService(CientificoServ cientificoService) {
		this.cientificoService = cientificoService;
	}
	
	public ProyectoServ getProyectoService() {
		return proyectoService;
	}

	public void setProyectoService(ProyectoServ proyectoService) {
		this.proyectoService = proyectoService;
	}
	
	public Principal getPrincipal() {
		return principal;
	}
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public GestionCientificos getGestionCientificos() {
		return gestionCientificos;
	}

	public void setGestionCientificos(GestionCientificos gestionCientificos) {
		this.gestionCientificos = gestionCientificos;
	}
	
	public GestionProyectos getGestionProyectos() {
		return gestionProyectos;
	}
	
	public void setGestionProyectos(GestionProyectos gestionProyectos) {
		this.gestionProyectos = gestionProyectos;
	}
	
	public GestionAsignado getGestionAsignado() {
		return gestionAsignado;
	}

	public void setGestionAsignado(GestionAsignado gestionAsignado) {
		this.gestionAsignado = gestionAsignado;
	}
	
	//Métodos para hacer visibles las vistas
	public void showGestionCientificos() {
		this.gestionCientificos.setVisible(true);
	}
	public void showAñadirCientifico() {
		this.gestionCientificos.setVisible(true);
	}
	
	public void showBuscarCientifico() {
		this.gestionCientificos.setVisible(true);
	}
	
	public void showGestionProyectos() {
		this.gestionProyectos.setVisible(true);
	}
	
	public void showAñadirProyecto() {
		this.gestionProyectos.setVisible(true);
	}
	
	public void showBuscarProyecto() {
		this.gestionProyectos.setVisible(true);
	}
	
	public void showGestionAsignado() {
		this.gestionAsignado.setVisible(true);
	}
	
	public void showAsignarProyectoCientifico() {
		this.gestionAsignado.setVisible(true);
	}

	public void showBuscarProyectoCientifico() {
		this.gestionAsignado.setVisible(true);
	}
	
	//Métodos CRUD
	public void añadirCientifico(Cientifico cientifico) {
		this.cientificoService.validarAñadir(cientifico);
	}
	
	public Cientifico buscarCientifico(String cientifico) {
		return this.cientificoService.validarBuscarCientifico(cientifico);
	}
	
	public LinkedList<Cientifico> obtenerTodosCientifico(){
		return this.cientificoService.validarBuscarTodos();
	}
	
	public void eliminarCientifico(String cientifico) {
		this.cientificoService.validarEliminar(cientifico);
	}
	
	
	public void añadirProyecto(Proyecto nuevoProyecto) {
		this.proyectoService.validarAñadir(nuevoProyecto);
	}
	
	public Proyecto buscarProyecto(String id) {
		return this.proyectoService.validarBuscarProyecto(id);
	}
	
	public LinkedList<Proyecto> obtenerTodosProyecto(){
		return this.proyectoService.validarBuscarTodos();
	}
	
	public void eliminarProyecto(String id) {
		this.proyectoService.validarEliminar(id);
	}
	
	public void añadirAsignadoA(AsignadoA asignadoA) {
		this.asignadoService.validarAñadir(asignadoA);
	}
	
	public AsignadoA buscarAsignadoA(String cientifico) {
		return this.asignadoService.validarBuscarAsignado(cientifico);
	}
	
	public LinkedList<AsignadoA> obtenerTodosAsignadoA(){
		return this.asignadoService.validarBuscarTodos();
	}
	
	public void eliminarAsignadoA(String cientifico) {
		this.asignadoService.validarEliminar(cientifico);
	}	
}