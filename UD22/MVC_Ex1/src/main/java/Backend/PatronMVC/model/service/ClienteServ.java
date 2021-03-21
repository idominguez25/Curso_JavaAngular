/*
 * Esta clase permite realizar las operaciones asociadas a la lógica de negocio como tal, desde ella realizamos las validaciones 
 * y llamadas a las operaciones CRUD del sistema.
 * 
 * En caso de que se requieran procesos adicionales asociados a la lógica de negocio, aquí será donde se creen los métodos para 
 * dichos procesos, por ejemplo el método validarRegistro determina si los datos son correctos y permite registrar la persona en
 * el Dao.
 */

package Backend.PatronMVC.model.service;

import javax.swing.JOptionPane;
import Backend.PatronMVC.controller.ClienteController;
import Backend.PatronMVC.model.dao.ClienteDao;
import Backend.PatronMVC.model.dto.Cliente;

public class ClienteServ {
	//Atributos
	private ClienteController clienteController; 
	public static boolean consultaPersona=false;
	public static boolean modificaPersona=false;
	
	
	//Método para validar el registro de un nuevo cliente.
	public static void validarRegistro(Cliente cliente) {
		ClienteDao clienteDao;
		
		if (cliente.getDNI() > Math.pow(10, 6)) {
			clienteDao = new ClienteDao();
			clienteDao.registrarCliente(cliente);	
		}
		else {
			JOptionPane.showMessageDialog(null,"El documento de la persona debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	//Método para validar la consulta de un cliente.
	public static Cliente validarConsulta(String id) {
		ClienteDao clienteDao;
		Cliente clienteBuscado = null;
		
		try {
			clienteDao = new ClienteDao();
			consultaPersona = true;
			clienteBuscado = ClienteDao.buscarCliente(Integer.parseInt(id));
								
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Debe ingresar un dato numerico","Error",JOptionPane.ERROR_MESSAGE);
			consultaPersona=false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
			consultaPersona=false;
		}
					
		return clienteBuscado;
	}
	
	//Método para validar la modificación de un cliente.
	public static void validarModificacion(Cliente cliente) {
		ClienteDao clienteDao;
		if (cliente.getNombre().length() > 3) {
			clienteDao = new ClienteDao();
			clienteDao.modificarCliente(cliente);	
			modificaPersona=true;
		} else {
			JOptionPane.showMessageDialog(null,"El nombre de la persona debe ser mayor a 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
			modificaPersona=false;
		}
	}
	
	//Método para validar la eliminación de un cliente.
	public static void validarEliminacion(String id) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.eliminarCliente(id);
	}

	//Getters y Setters
	public ClienteController getClienteController() {
		return clienteController;
	}

	public void setClienteController(ClienteController clienteController) {
		this.clienteController = clienteController;
	}

}


