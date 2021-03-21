package Backend.PatronMVC.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;

import Backend.PatronMVC.model.conexion.Conexion;
import Backend.PatronMVC.model.dto.Video;

public class VideoDao {
	
	public void insertarVideo(Video video) {
		Conexion conex = new Conexion();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO videos VALUES ('"+ "0"  +"',"
					+ "'" + video.getTitulo() + "'," 
					+ "'" + video.getDirector() + "'," + "'"
					+ video.getId_cliente() + "');";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}
	
	public Video buscarVideo(int id) {
		Conexion conex = new Conexion();
		Video video = new Video();
		boolean existe = false;
		
		try {
			String sql = "SELECT * FROM videos WHERE id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setInt(1, id);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				video.setId(Integer.parseInt(res.getString("id")));
				video.setTitulo(res.getString("titulo"));
				video.setDirector(res.getString("director"));
				video.setId_cliente(Integer.parseInt(res.getString("id_cliente")));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}
		
		if (!existe) {
			video = null;
		}

		return video;
	}
	
	public LinkedList<Video> getAllVideo(){
		Conexion conex = new Conexion();
		LinkedList<Video> listaVideos = new LinkedList<>();
		
		try {
			String sql = "SELECT * FROM videos";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				Video video = new Video();
				video.setId(Integer.parseInt(res.getString("id")));
				video.setTitulo(res.getString("title"));
				video.setDirector(res.getString("director"));
				video.setId_cliente(Integer.parseInt(res.getString("cli_id")));
				listaVideos.add(video);
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
				System.out.println(e);
			}
			
			if(listaVideos.isEmpty())
				listaVideos = null;
			
			return listaVideos;
		}
	}
