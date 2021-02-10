package Ex5;

public class MainApp {

	public static void main(String[] args) {
		//Variable
		boolean hayClase;
		
		//Creamos los objetos
		Aula aula1 = new Aula (1, 20, "Matemáticas");
		Profe profesor = new Profe ("Antonio", 43, 'H', "Matemáticas");
		Alumno clase [] = new Alumno [20];
		clase[0] = new Alumno ("Raquel", 19, 'M', 8);
		clase[1] = new Alumno("Marta", 18, 'M', 9);
		clase[2] = new Alumno("Jose", 18, 'H', 7);
		clase[3] = new Alumno("Alvaro", 20, 'H', 8);
		clase[4] = new Alumno("Miguel", 18, 'H', 5);
		clase[5] = new Alumno("Alba", 18, 'M', 4);
		clase[6] = new Alumno("Lucia", 19, 'M', 10);
		clase[7] = new Alumno("Edgard", 19, 'H', 4);
		clase[8] = new Alumno("Francisco", 18, 'H', 9);
		clase[9] = new Alumno("Ana", 20, 'M', 7);

		//Llamamos al método
		hayClase = clase (clase, profesor, aula1);
		
		if (hayClase) {
			estudiantesAprobados (clase);
		}
	}

	public static boolean clase(Alumno[] clase, Profe profesor, Aula aula1) {
		//Variables
		boolean hayClase = true;
		int numAsistentes = 0;
		final int porcentageMinAsistencia = 50;
		
		//Si el profesor está, el profesor da la materia correspondiente en el aula correspondiente
		//y hay más del 50% de alumnos, hay clase.
		if (!profesor.asistencia) {
			hayClase = false;
		}
		
		if (!profesor.getMateria().equals(aula1.getMateria())) {
			hayClase = false;
		}
		
		for (Alumno estudiante : clase) {
			if (estudiante.asistencia)
				numAsistentes++;
		}
		
		if (((double)aula1.getMaxEstudiantes() * porcentageMinAsistencia / 100) < numAsistentes) {
			hayClase = false;
		
		return hayClase;

	}
	}

	public static void estudiantesAprobados(Alumno clase[]) {
		//Variables
		int nota;
		int i = 0;
		int j = 0;
		Alumno hombresAprobados[] = new Alumno[clase.length];
		Alumno mujeresAprobadas[] = new Alumno[clase.length];
		
		//Recorremos el vector de estudiantes
		for (Alumno estudiante : clase) {
			nota = estudiante.getNota();
			if (nota >= 5) {
				if (estudiante.getSexo() == 'H') {
					hombresAprobados[i] = estudiante;
					i++;
				}
				else if (estudiante.getSexo() == 'M') {
					mujeresAprobadas[j] = estudiante;
					j++;
				}
				
			}
		}
		
		//Imprimimos el resultado
		System.out.println("Los hombres que han aprobado son:");
		for (i = 0; (hombresAprobados[i] != null) && (i < hombresAprobados.length) ;i++) {
			System.out.println(hombresAprobados[i].toString());		
		}
		
		System.out.println("En total han aprobado " + i + ".");

		System.out.println("Las mujeres que han aprobado son:");
		for (j = 0; (mujeresAprobadas[j] != null) && (j < mujeresAprobadas.length) ;j++) {
			System.out.println(mujeresAprobadas[j].toString());
		}
		System.out.println("En total han aprobado " + j + " alumnos.");
	}
}
