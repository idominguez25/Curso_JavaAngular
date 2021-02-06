import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex3App {
	
	public static void añadirArticulo (Hashtable<String, Double> articulos, Scanner teclado, Hashtable<String, Integer> cantidades) {
		String nombre;
		double precio;
		int cantidad;
		
		System.out.println("Nombre del artículo? ");
		nombre = teclado.next();
		
		System.out.println("Precio del artículo? ");
		precio = teclado.nextDouble();
		
		System.out.println("Cantidad en stock? ");
		cantidad = teclado.nextInt();
		
		articulos.put(nombre, precio);
		cantidades.put(nombre, cantidad);
		
		infoArticulos (articulos, cantidades);
		
		System.out.println("Artículo añadido!");
	}
	
	public static void infoArticulos (Hashtable<String, Double> articulos, Hashtable<String, Integer> cantidades) {
		for (String i : articulos.keySet()) {
			System.out.println("Articulo: " + i);
			System.out.println("Precio: " + articulos.get(i) + "€");
			System.out.println("En stock: " + cantidades.get(i));
			System.out.println();
		}
	}
	
	public static void infoArticulo (Hashtable<String, Double> articulos, Scanner teclado, Hashtable<String, Integer> cantidades) {
		String articulo;
		
		System.out.println("Sobre que artículo quieres consultar la información? ");
		articulo = teclado.next();
		
		System.out.println("Precio: " + articulos.get(articulo));
		System.out.println("En stock: " + cantidades.get(articulo));
		
	}
	
	public static void añadir_cantidades (Hashtable<String, Integer> cantidades) {
		cantidades.put("Monitor", 5);
		cantidades.put("Teclado mecánico", 10);
		cantidades.put("Ratón gaming", 4);
		cantidades.put("Altavoces", 6);
		cantidades.put("Carcasa torre", 8);
		cantidades.put("PC completo", 2);
		cantidades.put("Auriculares", 4);
		cantidades.put("Portátil", 3);
		cantidades.put("Disco duro", 5);
		cantidades.put("Echo dot", 1);
	}
	
	public static void añadir_articulos (Hashtable<String, Double> articulos) {
		articulos.put("Monitor", 150.0);
		articulos.put("Teclado mecánico", 50.0);
		articulos.put("Ratón gaming", 25.99);
		articulos.put("Altavoces", 30.0);
		articulos.put("Carcasa torre", 39.99);
		articulos.put("PC completo", 569.0);
		articulos.put("Auriculares", 29.95);
		articulos.put("Portátil", 599.99);
		articulos.put("Disco duro", 60.0);
		articulos.put("Echo dot", 44.99);
	}
	

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		Hashtable<String, Double> articulos = new Hashtable <>();
		Hashtable<String, Integer> cantidades = new Hashtable <>();
		Scanner teclado = new Scanner (System.in);
		int respuesta;
		
		añadir_articulos (articulos);
		añadir_cantidades (cantidades);
		
		//MENÚ
		System.out.println("Selecciona una opción: ");
		System.out.println("1. Consultar información sobre un artículo.");
		System.out.println("2. Ver la información de todos los artículos.");
		System.out.println("3. Añadir un nuevo artículo.");
		respuesta = teclado.nextInt();
		
		switch (respuesta) {
		case 1: infoArticulo (articulos, teclado, cantidades);
		break;
		case 2: infoArticulos (articulos, cantidades);
		break;
		case 3: añadirArticulo (articulos, teclado, cantidades);
		break;
		default: System.out.println("Introduce una respuesta válida.");
		}

	}

}
