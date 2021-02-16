package Excepcion;

public class MiExcepcion extends Exception {
	//Código de la excepción.
	private int codigoException;
	
	//Constructores.
	public MiExcepcion(int codigoError) {
		super();
		this.codigoException = codigoError;
	}

	public MiExcepcion() {
		super();
	}

	//Método para mostrar el mensaje según el código que sea.
	public String getMessage() {
		
		String mensaje= "";
		
		switch (codigoException) {
		case 111: 
			mensaje = "Exception 111: Asigna valor al objeto.";
		break;
		case 112:
			mensaje = "Exception 112: Error en el código.";
		break;
		case 024: 
			mensaje = "És par.";
		break;
		case 135:
			mensaje = "És impar.";
		break;
		}
		return mensaje;
	}
}
