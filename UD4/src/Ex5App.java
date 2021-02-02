/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex5App {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int a = 5;
		int b = 2;
		int c = 7;
		int d = 10;
		int aux;
		
		//MOSTRAR RESULTADOS
		System.out.println("Valor inicial variable a: " + a);
		System.out.println("Valor inicial variable b:" + b);
		System.out.println("Valor inicial variable c: " + c);
		System.out.println("Valor inicial variable d: " + d);
		
		aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
		
		System.out.println();
		
		System.out.println("Nou valor variable a: " + a);
		System.out.println("Nou valor variable b:" + b);
		System.out.println("Nou valor variable c: " + c);
		System.out.println("Nou valor variable d: " + d);
		
		
	}

}
