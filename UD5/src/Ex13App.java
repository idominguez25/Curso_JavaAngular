import java.util.Scanner;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex13App {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int num1, num2;
		String signo;
		Scanner teclado = new Scanner (System.in);
		
		//ENTRADA DE DATOS
		System.out.println("Introduce el valor del primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el valor del segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce un signo aritmetico: ");
		signo = teclado.next();
		
		//MOSTRAR RESULTADO
		switch (signo) {
		case "+": System.out.print(num1 + num2);
		break;
		case "-": System.out.println(num1 - num2);
		break;
		case "*": System.out.println(num1 * num2);
		break;
		case "/": System.out.println((double)num1 / num2);
		break;
		case "^": System.out.print(Math.pow(num1, num2));
		break;
		case "%": System.out.println(num1 % num2);
		}
		teclado.close();
	}

}
