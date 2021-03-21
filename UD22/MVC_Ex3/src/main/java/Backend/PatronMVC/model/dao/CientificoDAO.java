package Backend.PatronMVC.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import Backend.PatronMVC.model.conexion.Conexion;
import Backend.PatronMVC.model.dto.Cientifico;

public class CientificoDAO {
	
	public void añadirCientifico(Cientifico cientifico) {
		Conexion conex = new Conexion();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO Cientificos VALUES ('"+ cientifico.getDNI() +"',"
					+ "'" + cientifico.getNomApels() + "');";
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
	
	public Cientifico buscarCientifico(String DNI) {
		Conexion conex = new Conexion();
		Cientifico cientifico = new Cientifico();
		boolean existe = false;
		
		try {
			String sql = "SELECT * FROM Cientificos where DNI = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setString(1, DNI);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				cientifico.setDni(res.getString("DNI"));
				cientifico.setNomApels(res.getString("Nomapels"));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conectó");
			System.out.println(e);
		}
		
		if (!existe) {
			cientifico = null;
		}

		return cientifico;
	}
	
	public LinkedList<Cientifico> getAllCientifico(){
		Conexion conex = new Conexion();
		LinkedList<Cientifico> lista = new LinkedList<>();
		
		try {
			String sql = "SELECT * FROM Cientificos";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				Cientifico cientifico = new Cientifico();
				cientifico.setDni(res.getString("DNI"));
				cientifico.setNomApels(res.getString("Nomapels"));
				lista.add(cientifico);
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
	
	public void eliminarCientifico(String cientifico) {
		Conexion conex = new Conexion();
		
		try {
			String sql = "DELETE FROM Cientificos WHERE DNI='" + cientifico + "'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente a " + cientifico, "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se pudo eliminar");
		}
	}
}
