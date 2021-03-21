package Backend.PatronMVC.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import Backend.PatronMVC.model.conexion.Conexion;
import Backend.PatronMVC.model.dto.Proyecto;

public class ProyectoDAO {
	
	public void añadirProyecto(Proyecto proyecto) {
		Conexion conex = new Conexion();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO Proyectos VALUES ('"+ proyecto.getId() +"',"
					+ "'" + proyecto.getNombre()+ "'," 
					+ "'" + proyecto.getHoras() + "');";
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
	
	public Proyecto buscarProyecto(String Id) {
		Conexion conex = new Conexion();
		Proyecto proyecto = new Proyecto();
		boolean existe = false;
		
		try {
			String sql = "SELECT * FROM Proyectos where Id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setString(1, Id);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				proyecto.setId(res.getString("Id"));
				proyecto.setNombre(res.getString("Nombre"));
				proyecto.setHoras(Integer.parseInt(res.getString("Horas")));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}
		
		if (!existe) {
			proyecto = null;
		}

		return proyecto;
	}
	
	public LinkedList<Proyecto> getAllProyecto(){
		Conexion conex = new Conexion();
		LinkedList<Proyecto> lista = new LinkedList<>();
		
		try {
			String sql = "SELECT * FROM Proyectos";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				Proyecto proyecto = new Proyecto();
				proyecto.setId(res.getString("Id"));
				proyecto.setNombre(res.getString("Nombre"));
				proyecto.setHoras(Integer.parseInt(res.getString("Horas")));
				lista.add(proyecto);
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
	
	public void eliminarProyecto(String Id) {
		Conexion conex = new Conexion();
		
		try {
			String sql = "DELETE FROM Proyectos WHERE Id='" + Id + "'";
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
