import java.util.Scanner;

public class Ex11App {
	
	public static void mostrar_vectores (int [] vector1, int [] vector2, int [] vector3) {
		System.out.println("Vector 1:");
		for (int i = 0; i < vector1.length; i++) {
			System.out.println(vector1[i]);
		}
		System.out.println("Vector 2:");
		for (int j = 0; j < vector2.length; j++) {
			System.out.println(vector2[j]);
		}
		System.out.println("Vector 3:");
		for (int k = 0; k < vector3.length; k++) {
			System.out.println(vector3[k]);
		}
	}
	
	public static int [] multiplicar_vectores (int [] vector1, int [] vector2, int dimension) {
		int [] vector3 = new int [dimension];
		
		for (int i = 0; i < vector3.length; i++) {
			vector3[i] = (vector1[i] * vector2[i]);
		}
		return vector3;
	}
	
	public static void llenar_vectores (int [] vector1, int [] vector2, int min, int max) {
		//Llenamos vector1
		for (int i = 0; i < vector1.length; i++) {
			vector1[i] = (int)Math.floor(Math.random()*(min-(max+1))+(max));
		}
		
		//Copiamos los valores del vector1 al vector2
		for (int j = 0; j < vector1.length; j++) {
			 vector2[j] = vector1[j];
	}
		//Reasignamos los valores del vector2 con números aleatorios
		for (int k = 0; k < vector2.length; k++) {
			vector2[k] = (int)Math.floor(Math.random()*(min-(max+1))+(max));
		}
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int [] vector1;
		int [] vector2;
		int [] vector3;
		int dimension;
		int min, max;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("¿Cuántos valores quieres generar?");
		dimension = teclado.nextInt();
		
		vector1 = new int [dimension];
		vector2 = new int [dimension];
		
		System.out.println("Número mínimo?");
		min = teclado.nextInt();
		
		System.out.println("Número máximo?");
		max = teclado.nextInt();
		
		llenar_vectores (vector1, vector2, min, max);
		vector3 = multiplicar_vectores (vector1, vector2, dimension);
		
		mostrar_vectores (vector1, vector2, vector3);
		
		teclado.close();
	}

}
