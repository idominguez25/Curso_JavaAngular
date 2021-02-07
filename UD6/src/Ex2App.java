import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex2App {
	
	public static void numeros (int cantidad, Scanner teclado) {
		int max, min;
		
		//Preguntamos el intervalo de números.
		System.out.print("Num mínimo?");
		min = teclado.nextInt();
		
		System.out.print("Num máximo?");
		max = teclado.nextInt();
		
		//Imprimimos la cantidad de números aleatorios que hemos dicho anteriormente.
		for (int i = 0; i < cantidad; i++) {
			System.out.println((int)(Math.random()*max+min));
		}
}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int cantidad;
		Scanner teclado = new Scanner (System.in);
		
		//Preguntamos cuantos números quiere generar.
		System.out.print("¿Cuántos números aleatorios quieres generar?");
		cantidad = teclado.nextInt();
		
		numeros (cantidad, teclado);

		teclado.close();
	}

}
