package Ex4;

import java.util.Scanner;

import Excepcion.MiExcepcion;
import javax.swing.JOptionPane;

public class Ex4App {

	public static void main(String[] args) throws ExcepcionesCalculadora {
		
		//Variables
		double valor1 = 0, valor2 = 0, resultado = 0;
		Scanner teclado = new Scanner(System.in);
		String signoAritmetico;
		
		//Captura de datos por consola
		System.out.println("Introduce un valor:");
		valor1 = teclado.nextDouble();
		teclado.nextLine();	//Para consumir el salto de línea
		System.out.println("Introduce el signo aritmetico de la operacion:\n"
				+ "+ para sumar\n- para restar\n* para multiplicar\n/ para dividir\n"
				+ "^ para elevar el primer valor a la potencia del segundo\nr2 "
				+ "para la raiz cuadrada\nr3 para la raiz cubica\n% para el "
				+ "modulo");
		signoAritmetico = teclado.nextLine();
		if (!signoAritmetico.equals("r2") && !signoAritmetico.equals("r3")) {
			System.out.println("Introduce el segundo valor de la operación:");
			valor2 = teclado.nextDouble();
		}
		
		//Operamos con los datos
		switch (signoAritmetico) {
			case "+":
				resultado = Metodos.suma(valor1, valor2);
				break;
			case "-":
				resultado = Metodos.resta(valor1, valor2);
				break;
			case "*":
				resultado = Metodos.multiplicacion(valor1, valor2);
				break;
			case "/":
				resultado = Metodos.division(valor1, valor2);
				break;
			case "^":
				resultado = Metodos.potencia(valor1, valor2);
				break;
			case "r2":
				resultado = Metodos.raizCuadrada(valor1);
				break;
			case "r3":
				resultado = Metodos.raizCubica(valor1);
				break;
			case "%":
				resultado = Metodos.modulo(valor1, valor2);
				break;
			default:
				//Si no reconoce el signo aritmetico, arroja excepcion
				throw new ExcepcionesCalculadora(3);
		}
		
		//Mostramos resultado
		if (Double.isInfinite(resultado)) throw new ExcepcionesCalculadora(2);
		System.out.println("Resultado: "+ resultado);
		
		
		teclado.close();
	}

}