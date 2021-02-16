package Ex3;

public class Vehiculo {
	//Atributos
	protected String matricula;
	protected String marca;
	protected String color;
	
	
	//Constantes
	protected String matricula_DEF = "1234ABC";
	
	
	//Constructor
	public Vehiculo(String matricula, String marca, String color) {
		this.matricula = Metodos.comprobarMatricula (matricula, matricula_DEF);
		this.marca = marca;
		this.color = color;
	}
	
	//Getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]";
	}
	

}
