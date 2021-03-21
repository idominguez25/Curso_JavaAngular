package Backend.PatronMVC.model.service;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dao.AsignadoA_DAO;
import Backend.PatronMVC.model.dto.AsignadoA;

public class AsignadoA_Serv {
	private Controller controlador;

	public void validarAñadir(AsignadoA nuevoAsignado) {
		if(!nuevoAsignado.getCientifico().isBlank()) {
			AsignadoA_DAO asignadoDao = new AsignadoA_DAO();
			asignadoDao.añadirAsignado(nuevoAsignado);
		} else
			JOptionPane.showMessageDialog(null,"El documento de la persona debe tener 8 dígitos","Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}
	
	
	public AsignadoA validarBuscarAsignado(String cientifico) {
		AsignadoA_DAO asignadoDao;
		AsignadoA asignadoEncontrado = null;
		
		try {
			if(!cientifico.isBlank()) {
				asignadoDao = new AsignadoA_DAO();
				asignadoEncontrado = asignadoDao.buscarAsignado(cientifico);
			}
			else
				JOptionPane.showMessageDialog(null,"El documento de la persona debe tener 8 dígitos","Advertencia",JOptionPane.WARNING_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		return asignadoEncontrado;
	}
	
	
	public LinkedList<AsignadoA> validarBuscarTodos() {
		LinkedList<AsignadoA> lista = new LinkedList<>();
		
		try {
			lista = new AsignadoA_DAO().getAllAsignadoA();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return lista;
	}
	
	public void validarEliminar(String cientifico) {
		new AsignadoA_DAO().eliminarAsignado(cientifico);
	}
	
	
	//Getters y Setters
	public Controller getControlador() {
		return controlador;
	}

	public void setControlador(Controller controlador) {
		this.controlador = controlador;
	}
	
}
