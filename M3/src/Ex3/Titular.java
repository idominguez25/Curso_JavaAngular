package Ex3;

public class Titular extends Persona{
	//Atributos
	private boolean aseguranza;
	private boolean garaje;
	
	//Constructor
	public Titular(String nombre, String apellidos, String fechaNacimiento, String licencia, boolean aseguranza, boolean garaje) {
		super(nombre, apellidos, fechaNacimiento, licencia, aseguranza, garaje);
		this.aseguranza = aseguranza;
		this.garaje = garaje;
	}

	//Getters y setters
	public boolean isAseguranza() {
		return aseguranza;
	}

	public void setAseguranza(boolean aseguranza) {
		this.aseguranza = aseguranza;
	}

	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}

	@Override
	public String toString() {
		return "Titular [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", licencia=" + licencia + ", aseguranza=" + aseguranza + ", garaje=" + garaje + "]";
	}

}
