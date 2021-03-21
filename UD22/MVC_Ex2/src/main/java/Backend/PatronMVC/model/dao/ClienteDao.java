package Backend.PatronMVC.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Backend.PatronMVC.model.conexion.Conexion;
import Backend.PatronMVC.model.dto.Cliente;

public class ClienteDao {
	
	public void registrarCliente(Cliente cliente) {
		Conexion conex= new Conexion();
	
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO cliente VALUES ('"+ "0"  +"',"+ "'" + cliente.getNombre() + "'," 
					+ "'" + cliente.getApellido() + "'," + "'"
					+ cliente.getDireccion() + "'," + "'" + cliente.getDNI() + "'," + "'"
					+ cliente.getFecha() + "');";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}
	
	//Método para buscar un cliente
	public static Cliente buscarCliente(int id) {
		Conexion conex= new Conexion();
		Cliente cliente= new Cliente();
		boolean existe=false;
		
		try {
			String sql = "SELECT * FROM Cliente where id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setInt(1, id);
			ResultSet res = consulta.executeQuery();
			
			while(res.next()){
				existe=true;
				cliente.setId(Integer.parseInt(res.getString("id")));
				cliente.setNombre(res.getString("nombre"));
				cliente.setApellido(res.getString("apellido"));
				cliente.setDireccion(res.getString("direccion"));
				cliente.setDNI(Integer.parseInt(res.getString("DNI")));
				cliente.setFecha(res.getString("fecha"));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		if (!existe) {
			cliente = null;
		}
		return cliente;
	}
	
	public void modificarCliente(Cliente cliente) {
		
		Conexion conex= new Conexion();
		try{
			String sql="UPDATE persona SET id= ? ,nombre = ? , apellido = ? , direccion = ? , DNI = ?, fecha = ? WHERE id= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(sql);
			
			estatuto.setInt(1, cliente.getId());
            estatuto.setString(2, cliente.getNombre());
            estatuto.setString(3, cliente.getApellido());
            estatuto.setString(4, cliente.getDireccion()); 
            estatuto.setInt(5, cliente.getDNI());
            estatuto.setString(6, cliente.getFecha());
            estatuto.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se ha Modificado Correctamente");
            System.out.println(sql);
			
		}
		catch (Exception e) {
			System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void eliminarCliente(String id){
		Conexion conex= new Conexion();
		try {
			String sql= "DELETE FROM persona WHERE id='"+id+"'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Se ha eliminado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
            System.out.println(sql);
			st.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se ha podido eliminar");
		}
	}

}