package Ex3;

public class Persona {
	//Atributos
	protected String nombre;
	protected String apellidos;
	protected String fechaNacimiento;
	protected String licencia;
	
	//Constructor
	public Persona(String nombre, String apellidos, String fechaNacimiento, String licencia, Licencia licencia1) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.licencia = licencia1.nombreCompleto;
	}

}
