package Ex5;

public class Aula {
	
	//Añadimos los siguientes Atributos
	private int id;
	private int ocupacionMax;
	private String materia;
	
	
	//Añadimos el Constructor
	//usaremos tres parametros para definir: la id del Aula, la capacidad Maxima, y la materia que se da en esa aula
	
	public Aula(int id, int ocupacionMax, String materia) {
		this.id = id;
		this.ocupacionMax = ocupacionMax;
		this.materia = materia;
	}

	
	//Añadimos los Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOcupacionMax() {
		return ocupacionMax;
	}

	public void setOcupacionMax(int ocupacionMax) {
		this.ocupacionMax = ocupacionMax;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
}