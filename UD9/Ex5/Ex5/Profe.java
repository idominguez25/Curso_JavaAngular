package Ex5;

import java.util.Random;

public class Profe extends Persona{
	//Atributo
	private String materia;
	
	//Constantes
	public final String materia1 = "Matemáticas";
	public final String materia2 = "Filosofía";
	public final String materia3 = "Física";
	
	//Constructor
	public Profe(String materia, int i, char c, String string) {
		super();
		this.materia = materia;
	}

	//Getters & Setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	//Método para saber si el profe está
	public boolean falta () {
		Random random = new Random();
		return random.nextBoolean();
	}
	
}
