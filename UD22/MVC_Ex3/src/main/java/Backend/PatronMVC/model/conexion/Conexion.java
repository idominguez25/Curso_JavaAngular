package Backend.PatronMVC.model.conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Clase que permite conectar con la base de datos
 *
 */
public class Conexion {
	static String bd = "cientifico_proyecto";
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://127.0.0.1:3306/?useTimezone=true&serverTimezone=UTC";
	  Connection conn = null;

	   // Constructor de DbConnection 
	   public Conexion() {
	      try{
	         //obtenemos el driver de para mysql
	    	  Class.forName("com.mysql.cj.jdbc.Driver");
	    	  //obtenemos la conexion
	    	  conn = DriverManager.getConnection(url, login, password);
	    	  Statement st = conn.createStatement();
	    	  st.executeQuery("USE " + bd + ";");
	    	  JOptionPane.showMessageDialog(null, "Server Connected");
	      }
	      catch(SQLException e){
	    	 JOptionPane.showMessageDialog(null, "No se ha podido connectar a la base de datos");
	    	 JOptionPane.showMessageDialog(null, e);
	      }catch(ClassNotFoundException e){
	         System.out.println(e);
	      }catch(Exception e){
	         System.out.println(e);
	      }
	   }
	   //Permite retornar la conexion
	   public Connection getConnection(){
	      return conn;
	   }
	   
	   //Método que finaliza la conneción an MySQL
	   public void desconectar(){
		      conn = null;
	   }
}