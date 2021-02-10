package Ex5;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

abstract class Persona {
	//Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	
	//Constructor por defecto
	public Persona() {
		this (null, 0, 'H');
	}

	//Constructor con todos los atributos
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public abstract boolean faltas ();
	
}
