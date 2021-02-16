package Ex3;

public class Licencia {
	//Atributos
	protected int ID;
	protected String tipo;
	protected String nombreCompleto;
	protected String fechaCaducidad;
	
	//Constructor
	public Licencia(int iD, String tipo, String nombreCompleto, String fechaCaducidad) {
		ID = iD;
		this.tipo = tipo;
		this.nombreCompleto = nombreCompleto;
		this.fechaCaducidad = fechaCaducidad;
	}

	//Getters y setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Licencia [ID=" + ID + ", tipo=" + tipo + ", nombreCompleto=" + nombreCompleto + ", fechaCaducidad="
				+ fechaCaducidad + "]";
	}
	
	

}
