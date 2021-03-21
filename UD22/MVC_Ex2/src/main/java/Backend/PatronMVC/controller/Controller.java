
/*
 * Esta parte del patrón es la que define la lógica de administración del sistema, 
 * establece la conexión entre la vista y el modelo.
 */

package Backend.PatronMVC.controller;

import Backend.PatronMVC.model.dto.Cliente;
import Backend.PatronMVC.model.dto.Video;
import Backend.PatronMVC.model.service.ClienteServ;
import Backend.PatronMVC.model.service.VideoServ;
import Backend.PatronMVC.view.BuscarCliente;
import Backend.PatronMVC.view.BuscarVideo;
import Backend.PatronMVC.view.InsertarCliente;
import Backend.PatronMVC.view.InsertarVideo;
import Backend.PatronMVC.view.Principal;
import java.util.LinkedList;


public class Controller {
	
	//Clases services
	private ClienteServ clienteServ;
	private VideoServ videoServ;

	//Interfaz
	private Principal ventanaPrincipal;
	private InsertarVideo ventanaInsertarVideo;
	private InsertarCliente ventanaInsertarCliente;
	private BuscarVideo ventanaBuscarVideo;
	private BuscarCliente ventanaBuscarCliente;

	// Métodos getters y setters 
	public ClienteServ getClienteServ() {
		return clienteServ;
	}

	public void setClienteServ(ClienteServ clienteServ) {
		this.clienteServ = clienteServ;
	}

	public VideoServ getVideoServ() {
		return videoServ;
	}

	public void setVideoServ(VideoServ videoServ) {
		this.videoServ = videoServ;
	}

	public Principal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(Principal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public InsertarVideo getVentanaInsertarVideo() {
		return ventanaInsertarVideo;
	}

	public void setInsertarVideo(InsertarVideo ventanaInsertarVideo) {
		this.ventanaInsertarVideo = ventanaInsertarVideo;
	}

	public InsertarCliente getInsertarCliente() {
		return ventanaInsertarCliente;
	}

	public void setInsertarCliente(InsertarCliente ventanaInsertarCliente) {
		this.ventanaInsertarCliente = ventanaInsertarCliente;
	}

	public BuscarVideo getBuscarVideo() {
		return ventanaBuscarVideo;
	}

	public void setBuscarVideo(BuscarVideo ventanaBuscarVideo) {
		this.ventanaBuscarVideo = ventanaBuscarVideo;
	}

	public BuscarCliente getBuscarCliente() {
		return ventanaBuscarCliente;
	}

	public void setBuscarCliente(BuscarCliente ventanaBuscarCliente) {
		this.ventanaBuscarCliente = ventanaBuscarCliente;
	}
	
	//Métodos para hacer visible las visstas
	public void showInsertarCliente() {
		this.ventanaInsertarCliente.setVisible(true);
	}
	
	public void showInsertarVideo() {
		this.ventanaInsertarVideo.setVisible(true);
	}
	
	public void showBuscarCliente() {
		this.ventanaBuscarCliente.setVisible(true);
	}
	
	public void showBuscarVideo() {
		this.ventanaBuscarVideo.setVisible(true);
	}

	
	//Métodos CRUD
	
	public void insertarCliente(Cliente nuevoCliente) {
		this.clienteServ.validarRegistro(nuevoCliente);
	}
	
	public Cliente buscarCliente(String id) {
		return this.clienteServ.validarConsulta(id);
	}
	
	public void insertarVideo(Video nuevoVideo) {
		this.videoServ.validarRegistro(nuevoVideo);
	}
	
	public Video buscarVideo(String id) {
		return this.videoServ.validarConsulta(id);
	}
	
	public LinkedList<Video> obtenerVideos(){
		return  this.videoServ.getAllVideo();
	}

	
}