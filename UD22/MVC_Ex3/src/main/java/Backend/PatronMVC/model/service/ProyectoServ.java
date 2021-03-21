package Backend.PatronMVC.model.service;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dao.ProyectoDAO;
import Backend.PatronMVC.model.dto.Proyecto;

public class ProyectoServ {
	
	private Controller controlador;
	
	public void validarAñadir(Proyecto nuevoProyecto) {
		if(nuevoProyecto.getId().length() == 4)
			new ProyectoDAO().añadirProyecto(nuevoProyecto);
		else
			JOptionPane.showMessageDialog(null,"El identificador del proyecto debe tener 4 dígitos","Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}
	
	
	public Proyecto validarBuscarProyecto(String Id) {
		Proyecto proyectoEncontrado = null;
		
		try {
			if(Id.length() == 4) 
				proyectoEncontrado = new ProyectoDAO().buscarProyecto(Id);
			else
				JOptionPane.showMessageDialog(null,"El identificador del proyecto debe tener 4 dígitos","Advertencia",JOptionPane.WARNING_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		return proyectoEncontrado;
	}
	
	
	public LinkedList<Proyecto> validarBuscarTodos() {
		LinkedList<Proyecto> lista = new LinkedList<>();
		
		try {
			lista = new ProyectoDAO().getAllProyecto();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return lista;
	}
	
	public void validarEliminar(String id) {
		new ProyectoDAO().eliminarProyecto(id);
	}
	
	
	//Getters y Setters
	public Controller getControlador() {
		return controlador;
	}

	public void setControlador(Controller controlador) {
		this.controlador = controlador;
	}
	
}
