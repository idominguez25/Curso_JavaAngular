package Ex5;

import java.util.Random;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
class Alumno extends Persona {
	//Atributos
	private int nota;
	
	//Constante
	public final int porcentageFaltas = 50;

	//Constructor con el nuevo atributo
	public Alumno(String nombre, int edad, char sexo, int nota) {
		super(nombre, edad, sexo);
		this.nota = nota;
	}
	
	//Getters & Setters
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	//Método para saber si hay más de un 50% de alumnos
	public boolean falta () {
		boolean superaPorcentage = false;
		Random r = new Random();
		int porcentage = r.nextInt(100)+1;
		
		if (porcentage >= 50) {
			superaPorcentage = true;
		}
		return superaPorcentage;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " Edad: " + this.edad + " Calificacion: " +
				this.nota;
	}
}
