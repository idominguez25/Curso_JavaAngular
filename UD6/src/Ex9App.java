import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex9App {
	
	public static void mostrar_vector (int [] numeros, int suma) {	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición: " + i + ", Valor: " + numeros[i]);
		}
		System.out.println("Suma de los valores: " + suma);
	}
	
	public static int llenar_vector (int [] numeros, int min, int max) {
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.floor(Math.random()*(min-(max+1))+(max));
			suma = suma + numeros[i];
		}
		
		return (suma);
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int [] numeros;
		int num;
		int suma;
		int min = 0;
		int max = 9;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("¿Cuántos números quieres generar?");
		num = teclado.nextInt();
		
		numeros = new int [num];
		
		suma = llenar_vector (numeros, min, max);
		mostrar_vector (numeros, suma);

		teclado.close();
	}

}
