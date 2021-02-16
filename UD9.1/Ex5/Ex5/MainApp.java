package Ex5;
/**
 *
 * Clase ejecutable que se encarga de instanciar todos los objetos de las clases Aula, Profesor
 * y Estudiante, y despues comprueba si tenemos clase llamando al metodo consultaClase. En caso
 * de que sea asi, llamamos al metodo alumnesAprobados y mostramos cuantos alumnos y cuantas
 * alumnas han aprobado.
 */
public class MainApp {

	
	public static void main(String[] args) {
		
		//Variables
		boolean tenemosClase;
		Profesor profesorHoy;
		Aula aulaHoy;
		
		//Creamos objetos Alumnos
		Estudiante claseHoy[] = new Estudiante[10];
		claseHoy[0] = new Estudiante("Raquel", 19, "mujer", 8);
		claseHoy[1] = new Estudiante("Marta", 18, "mujer", 9);
		claseHoy[2] = new Estudiante("Jose", 18, "hombre", 7);
		claseHoy[3] = new Estudiante("Alvaro", 20, "hombre", 8);
		claseHoy[4] = new Estudiante("Miguel", 18, "hombre", 5);
		claseHoy[5] = new Estudiante("Alba", 18, "mujer", 4);
		claseHoy[6] = new Estudiante("Lucia", 19, "mujer", 10);
		claseHoy[7] = new Estudiante("Edgard", 19, "hombre", 4);
		claseHoy[8] = new Estudiante("Francisco", 18, "hombre", 9);
		claseHoy[9] = new Estudiante("Ana", 20, "mujer", 7);

		
		//creamos al objeto profesor
		profesorHoy = new Profesor("Anna", 30, "mujer", "filosofia");
		
		//creamos al objeto Aula
		aulaHoy = new Aula(123, 10, "filosofia");
		
		
		//Llamada al metodo consultaClase con los parametros del profesor, la aula y los alumnos
		//aqui comprobamos si hay clase
		tenemosClase = consultaClase(claseHoy, profesorHoy, aulaHoy);
		
		
		//si se realiza la clase lo comunicamos por pantalla
		if(tenemosClase){
		System.out.println("\nSe ha realizado la clase \n");
		}
		
		//en caso contrario comunicamos que no se ha realizado
		else {System.out.println("\nNo se ha realizado la clase \n");}
		
		//Si hay clase llamamos al metodo para mostrar a los alumnos aprobados
		if (tenemosClase)
			estudiantesAprobados(claseHoy);
			
	}
	
	
	//Metodo para comprobar si tenemos clase
	public static boolean consultaClase (Estudiante claseHoy[], Profesor profesorHoy, Aula aulaHoy) {
		//Variables
		boolean tenemosClase = true;
		final int ASISTENCIA_MIN_PORC = (aulaHoy.getOcupacionMax()/2);
		int numAsistentesHoy = 0;
		
		//Comprobamos que el profesorHoy asiste, que profesorHoy.materia y
		//aulaHoy.materia coinciden, y recorremos el vector claseHoy y comprobamos que los
		//alumnos asistentes son mas del 50% de la ocupacionMax del aulaHoy
		if (!profesorHoy.asistencia) {
			tenemosClase = false;
		System.out.println("El Profesor no ha venido");
		}
		
		//si el profesor y la materia NO coinciden indicamos que el booleano "tenemosClase" es falso
		if (!profesorHoy.getMateria().equals(aulaHoy.getMateria())) {
			tenemosClase = false;
			
		//lo imprimimos por pantalla	
		System.out.println("La materia no es la que toca");
		}
		
		//hacemos un loop para contar la cantidad de alumnos que asistiran
		for (Estudiante estudiante : claseHoy) {
			if (estudiante.getAsistencia())
				numAsistentesHoy++;
			
		}
		
		
		//si el numero de asistentes es inferior al porcentaje de numero de asistencia 
		if (numAsistentesHoy < ASISTENCIA_MIN_PORC) {
			
			//no hay clase, lo comunicamos por pantalla
			tenemosClase = false;
		System.out.println("No hay suficientes alumnos");
		
			//indicamos tambien el numero de alumnos que han asistido
		System.out.println("Hoy han asistido: " +numAsistentesHoy + " Alumnos");
		}
		
		//retornamos un valor booleano para determiar si se hace clase o no
		return tenemosClase;
	}
	
	//Metodo para mostrar cuantos alumnos y alumnas han aprobado
	public static void estudiantesAprobados(Estudiante claseHoy[]) {
		
		//Creamos dos Arrays Objeto con el tamaño de la lista de estudiantes que introducimos
		int calificacion, i = 0, j = 0;
		Estudiante hombresAprobados[] = new Estudiante[claseHoy.length];
		Estudiante mujeresAprobadas[] = new Estudiante[claseHoy.length];
		
		//Recorremos el vector de estudiantes para filtrar a los alumnos aprobados
		for (Estudiante estudiante : claseHoy) {
			calificacion = estudiante.getCalificacion();
			
			if (calificacion >= 5) {	//Los alumnos estan aprobados
				
				//si el estudiante es hombre ingresaremos esos datos en el Array objeto "hombresAprobados" 
				if (estudiante.getSexo() == "hombre") {
					hombresAprobados[i] = estudiante;
					i++;
				}
				//en caso de que el estudiante sea mujer ingresaremos esos datos en el Array objeto "mujeresAprobadas" 
				else if (estudiante.getSexo() == "mujer") {
					mujeresAprobadas[j] = estudiante;
					j++;
				}
			}
		}
		
		//Imprimimos una lista con los aprobados, invocamos al metodo toString para que imprima los datos de los alumnos en el recorrido del iterador
		System.out.println("Los Alumnos aprobados son:");
		for (i = 0; (hombresAprobados[i] != null) && (i < hombresAprobados.length) ;i++) {
			
			System.out.println(hombresAprobados[i].toString());		
		}
		System.out.println("\nEn total han aprobado " +j + " Chicos.");
		
		System.out.println("\nLas Alumnas aprobadas son:");
		for (j = 0; (mujeresAprobadas[j] != null) && (j < mujeresAprobadas.length) ;j++) {
			System.out.println(mujeresAprobadas[j].toString());
		}
		System.out.println("\nEn total han aprobado " +j + " chicas.");
		
	}

}
