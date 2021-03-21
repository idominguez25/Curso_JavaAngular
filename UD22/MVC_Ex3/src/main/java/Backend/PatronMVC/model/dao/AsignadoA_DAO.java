package Backend.PatronMVC.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import Backend.PatronMVC.model.conexion.Conexion;
import Backend.PatronMVC.model.dto.AsignadoA;

public class AsignadoA_DAO {

	public void añadirAsignado(AsignadoA asignadoA) {
		Conexion conex = new Conexion();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO AsignadoA VALUES ('"+ asignadoA.getCientifico() +"',"
					+ "'" + asignadoA.getProyecto() + "');";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se añadió");
		}
	}
	
	public AsignadoA buscarAsignado(String cientifico) {
		Conexion conex = new Conexion();
		AsignadoA asignadoA = new AsignadoA();
		boolean existe = false;
		
		try {
			String sql = "SELECT * FROM AsignadoA where DNI_cientificos = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setString(1, cientifico);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				asignadoA.setCientifico(res.getString("DNI_cientificos"));
				asignadoA.setProyecto(res.getString("Id_proyecto"));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conectó");
			System.out.println(e);
		}
		
		if (!existe) {
			asignadoA = null;
		}

		return asignadoA;
	}
	
	public LinkedList<AsignadoA> getAllAsignadoA(){
		Conexion conex = new Conexion();
		LinkedList<AsignadoA> lista = new LinkedList<>();
		
		try {
			String sql = "SELECT * FROM AsignadoA";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				AsignadoA asignadoA = new AsignadoA();
				asignadoA.setCientifico(res.getString("DNI_cientificos"));
				asignadoA.setProyecto(res.getString("Id_proyecto"));
				lista.add(asignadoA);
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conectó");
			System.out.println(e);
		}
		
		if(lista.isEmpty())
			lista = null;
		
		return lista;
	}
	
	public void eliminarAsignado(String cientifico) {
		Conexion conex = new Conexion();
		
		try {
			String sql = "DELETE FROM AsignadoA WHERE Cientifico='" + cientifico + "'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se elimino");
		}
	}
}
