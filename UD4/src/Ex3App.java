/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex3App {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int x = 4;
		int y = 2;
		double n = 10.5;
		double m = 5.29;
		
		//MOSTRAR RESULTADOS
		System.out.println("Valor de la variable X: " + x);
		System.out.println("Valor de la variable Y: " + y);
		System.out.println("Valor de la variable N: " + n);
		System.out.println("Valor de la variable M: " + m);
		
		System.out.println();
		
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + " % " + y + " = " + (x % y));
		
		System.out.println();
		
		System.out.println(n + " + " + m + " = " + (n + m));
		System.out.println(n + " - " + m + " = " + (n - m));
		System.out.println(n + " * " + m + " = " + (n * m));
		System.out.println(n + " / " + m + " = " + (n / m));
		System.out.println(n + " % " + m + " = " + (n % m));
		
		System.out.println();
		
		System.out.println(x + " + " + n + " = " + (x + n));
		System.out.println(y + " / " + m + " = " + (n / m));
		System.out.println(y + " % " + m + " = " + (n % m));
		
		System.out.println();
		
		System.out.println("Doble de " + x + ": " + (x*2));
		System.out.println("Doble de " + y + ": " + (y*2));
		System.out.println("Doble de " + n + ": " + (n*2));
		System.out.println("Doble de " + m + ": " + (m*2));
		
		System.out.println();
		
		System.out.println(x + " + " + y + " + " + n + " + " + m + " = " + (x + y + n + m));
		System.out.println(x + " * " + y + " * " + n + " * " + m + " = " + (x * y * n * m));
	}

}
