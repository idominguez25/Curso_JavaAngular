package Ex5;

import java.util.concurrent.ThreadLocalRandom;	//Para generar valores aleatorios

//Creamos la Subclase de Persona, llamada clase Profesor

public class Profesor extends Persona {
	
	//Añadimos las Constantes de las materias que puede dar el profesor
	public final String MATEM = "matematicas";
	public final String FILOS = "filosofia";
	public final String FISIC = "fisica";
	
	//añadimos una constante que nos determinara el porcentaje de asistencia del profesor
	public final int INDICE_ASISTENCIA_PROFESOR = 80;
	
	//añadimos el atributo de la materia para el profesor
	private String materia;
	
	
	//Creamos el Constructor de la clase profesor
	public Profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}


	//Getters y setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}


	//Creamos un Metodo con retorno que determina si un profesor se ha presentado a la clase o no
	public boolean presenteEnClase () {
		
		//creamos una variable booleana que nos diga si esta presente
		boolean presente;
		
		//Generamos un valor aleatorio entre 1 y 100
		int	valorAleatorio = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		
		//Comprobamos si el profesor ha asistido a la clase
		if (valorAleatorio <= INDICE_ASISTENCIA_PROFESOR)
			presente = true;
		else
			presente = false;
		
		//retornamos un valor booleano
		return presente;
	}
}
	
