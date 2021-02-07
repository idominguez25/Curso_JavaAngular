import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex7App {
	
	public static void cambio (double euros, String moneda) {
		double cambio;
		if (moneda.equals("libras")) {
			cambio = euros * 0.86;
			System.out.println("Equivale a " + cambio + "€");
		}
		if (moneda.equals("dolares")) {
			cambio = euros * 1.28611;
			System.out.println("Equivale a " + cambio + "$");
		}
		if (moneda.equals("yenes")) {
			cambio = euros * 129.185;
			System.out.println("Equivale a " + cambio + "¥" );
		}
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		double euros;
		String moneda;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Cantidad de euros? ");
		euros = teclado.nextDouble();
		System.out.println("A que moneda los quieres pasar? (libras, dolares o yenes) ");
		moneda = teclado.next();
		
		cambio (euros, moneda);

		teclado.close();
	}

}
