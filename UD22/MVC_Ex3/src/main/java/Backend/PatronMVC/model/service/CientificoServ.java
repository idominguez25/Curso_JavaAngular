package Backend.PatronMVC.model.service;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dao.CientificoDAO;
import Backend.PatronMVC.model.dto.Cientifico;

public class CientificoServ {
	
	private Controller controlador;
	
	public void validarAñadir(Cientifico cientifico) {
		if(cientifico.getDNI().length() > 6)
			new CientificoDAO().añadirCientifico(cientifico);
		else
			JOptionPane.showMessageDialog(null,"El dni del cientifico debe tener 8 dígitos","Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}
	
	
	public Cientifico validarBuscarCientifico(String cientifico) {
		Cientifico asignadoEncontrado = null;
		
		try {
			if(cientifico.length() > 6) 
				asignadoEncontrado = new CientificoDAO().buscarCientifico(cientifico);
			else
				JOptionPane.showMessageDialog(null,"El dni del cientifico debe tener 8 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		return asignadoEncontrado;
	}
	
	
	public LinkedList<Cientifico> validarBuscarTodos() {
		LinkedList<Cientifico> lista = new LinkedList<>();
		
		try {
			lista = new CientificoDAO().getAllCientifico();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return lista;
	}
	
	public void validarEliminar(String cientifico) {
		new CientificoDAO().eliminarCientifico(cientifico);
	}
	
	//Getters y Setters
	public Controller getControlador() {
		return controlador;
	}

	public void setControlador(Controller controlador) {
		this.controlador = controlador;
	}
}
