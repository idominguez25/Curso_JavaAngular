import java.util.Scanner;

public class Ex12App {
	
	public static void mostrar_vectores (int [] vector1, int [] vector2, int num) {
		System.out.println("Números:");
		for (int i = 0; i < vector1.length; i++) {
		System.out.println(vector1[i]);
		}
		
		System.out.println("Números acabados en " + num + ":");
		for (int j = 0; j < vector2.length; j++) {
			System.out.println(vector2[j]);
		}
	}
	
	public static int [] buscar_numero (int [] vector1, int num) {
		int [] vector2;
		int dimension = 0;
		int k = 0;
		
		//Contamos cuantas coincidencias hay para dimensionar el segundo vector.
		for (int i = 0; i < vector1.length; i++) {
			if (vector1[i] % 10 == num) {
				dimension++;
			}
		}
		
		vector2 = new int [dimension];
		
		//Llenamos el segundo vector.
		for (int j = 0; j < vector1.length; j++) {
			if (vector1[j] % 10 == num) {
				vector2[k] = vector1[j];
				k++;
			}
		}
		return (vector2);
	}
	
	public static void llenar_vector (int [] vector1) {
		for (int i = 0; i < vector1.length; i++) {
			vector1[i] = (int)Math.floor(Math.random()*(1-(300+1))+(300));
		}
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int [] vector1;
		int [] vector2;
		int dimension;
		int num;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("¿Cuántos números quieres generar?");
		dimension = teclado.nextInt();
		
		vector1 = new int [dimension];
		
		llenar_vector (vector1);

		System.out.println("Introduce un número del 0 al 9:");
		num = teclado.nextInt();
		
		if (num > 9) {
			System.out.println("ERROR!");
		}
		
		vector2 = buscar_numero (vector1, num);
		
		mostrar_vectores (vector1, vector2, num);
		
		teclado.close();
	}

}
