import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1App {

	public static void main(String[] args) {
		//Generamos un número aleatorio
		int numeroAleatorio = (int)(Math. random()*500+1);
		
		//Variable para guardar el número que ingresemos por teclado y contador de intentos
		int numero = 0;
		int intentos = 0;
		Scanner teclado = new Scanner (System.in);

		//Mientras el número que le ingresamos no sea igual al aleatorio
		//nos indicarà si el num es más pequeño o más grande y contará los intentos
		try {
			while (numero != numeroAleatorio) {
				System.out.println("Introduce un número:");
				numero = teclado.nextInt();
				intentos++;
				
				if (numero < numeroAleatorio) {
					System.out.println("El número es más grande.");
				}
				else {
					System.out.println("El número es más pequeño.");
				}
				}
			System.out.println("Lo has adivinado!!");
		}
		
		//Si no introduce un número saltará el mensaje de error.
		catch (InputMismatchException ex) {
			System.out.println("No has introducido un carácter válido.");
			intentos++;
		}
		
		//Cuando acertemos, nos mostrará el número de intentos que hemos hecho hasta adivinarlo.
		System.out.println("Has hecho " + intentos + " intentos.");
		
		teclado.close();
	}
}

