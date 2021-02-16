package Ex5;

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
		this.contraseña = Metodos.generarPassword(longitud);
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
	
	//toString
	@Override
	public String toString() {
		return "Contraseña=" + contraseña;
	}
	
}
