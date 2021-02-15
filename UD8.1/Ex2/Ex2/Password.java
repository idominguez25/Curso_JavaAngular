package Ex2;

public class Password {
	//Atributos
	protected int longitud;
	protected String contraseña;
	
	//Constante
	private final int longitud_DEF = 8;

	//Constructores
	public Password() {
		this.longitud = longitud_DEF;
		this.contraseña = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = Metodos.generarContraseña (longitud);
	}
	
	//Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	//toString para mostrar el resultado
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

}
