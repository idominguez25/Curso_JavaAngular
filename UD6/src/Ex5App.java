import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex5App {
	
	public static void pasar_binario (int num) {
		int [] resto;
		resto = new int [6];
		int j = 0;
		
		while (num > 0) {
			resto [j] = num % 2;
			num = num / 2;
			j++;
		}
		for (int i = resto.length - 1; i >= 0; i--) {
			System.out.print(resto[i]);
		}
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int num;
		Scanner teclado = new Scanner (System.in);
		
		//Preguntamos número
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		
		pasar_binario (num);

		teclado.close();
	}

}
