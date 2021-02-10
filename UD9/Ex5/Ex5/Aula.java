package Ex5;
/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Aula {
	//Atributos
	private int id;
	private int maxEstudiantes;
	private String materia;
	
	//Constructor por defecto
	public Aula() {
		this (1, 20, "física");
	}

	//Constructor con todos los atributos
	public Aula(int id, int maxEstudiantes, String materia) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxEstudiantes=" + maxEstudiantes + ", materia=" + materia + "]";
	}
	
	
}
