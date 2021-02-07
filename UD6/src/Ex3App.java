import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex3App {
	
	public static boolean es_primo (int num, boolean primo) {
		int contador = 0;
        for (int i = 1; i < (num + 1); i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador != 2) {
        	primo = false;
        }
        else {
        	primo = true;
        }
          return (primo);
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int num;
		boolean primo = false;
		Scanner teclado = new Scanner (System.in);
		
		//Preguntar el número
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		primo = es_primo (num, primo);
		
		//Mostrar resultado
		System.out.println(primo);
		
		teclado.close();

	}

}
