
public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	//Constantes
	private final char sexo_DEF = 'H';
	
	//Constructor por defecto.
	public Persona() {
		this.nombre = null;
		this.edad = 0;
		this.DNI = null;
		this.sexo = sexo_DEF;
		this.peso = 0;
		this.altura = 0;
	}

	//Constructor con el nombre, la edad y el sexo.
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	//Constructor con todos los parámetros.
	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	//toString para mostrar los datos.
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
}
