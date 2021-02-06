import java.util.Hashtable;
import java.util.Scanner;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex4App {
	
	public static double precioIVA (double precioT, double IVA) {
		double total;
		
		total = precioT + IVA;
		
		return (total);
	}
	
	public static double IVA (double precio_total) {
		double IVA;
		
		IVA = precio_total * 0.21;
		
		return (IVA);
	}
	
	public static double precio_total (Hashtable<String, Integer> productos_cantidad_carrito, Hashtable<String, Double> precio_productos_stock) {
		double total = 0;
		for(String i : productos_cantidad_carrito.keySet()) {
		    total += (productos_cantidad_carrito.get(i) * precio_productos_stock.get(i));
		}
		return (total);

	}
	
	public static void restar_stock (Hashtable<String, Integer> productos_cantidad_carrito, Hashtable<String, Integer> productos_cantidad_stock) {
		for (String i : productos_cantidad_stock.keySet()) {
			System.out.println(i + ": " + (productos_cantidad_carrito.get(i) - productos_cantidad_stock.get(i)));
		}
	}
	
	public static void añadirPPcarrito (Hashtable<String, Integer> productos_cantidad_carrito, Hashtable<String, Double> precio_productos_stock) {
		System.out.println("TIQUET: ");
		for (String i : productos_cantidad_carrito.keySet()) {
			System.out.println("Articulo: " + i);
			System.out.println("Cantidad: " + productos_cantidad_carrito.get(i));
			System.out.println("Precio: " + (productos_cantidad_carrito.get(i) * precio_productos_stock.get(i)));
			System.out.println();
		}
	}
	
	public static void añadirPCcarrito (Hashtable<String, Integer> productos_cantidad_carrito) {
		productos_cantidad_carrito.put("Agua", 3);
		productos_cantidad_carrito.put("Pizza", 2);
		productos_cantidad_carrito.put("Huevos", 1);
		productos_cantidad_carrito.put("Galletas", 4);
		productos_cantidad_carrito.put("Baguette", 2);
	}
	
	public static void añadirPPstock (Hashtable<String, Double> precio_productos_stock) {
		precio_productos_stock.put("Agua", 1.0);
		precio_productos_stock.put("Leche", 1.25);
		precio_productos_stock.put("Yogures", 0.99);
		precio_productos_stock.put("Manzanas", 1.50);
		precio_productos_stock.put("Galletas", 0.85);
		precio_productos_stock.put("Baguette", 1.0);
		precio_productos_stock.put("Pizza", 2.30);
		precio_productos_stock.put("Lomo", 4.59);
		precio_productos_stock.put("Huevos", 1.85);
		precio_productos_stock.put("Arroz", 1.30);
	}
	
	public static void añadirPCstock (Hashtable<String, Integer> productos_cantidad_stock) {
		productos_cantidad_stock.put("Agua", 10);
		productos_cantidad_stock.put("Leche", 8);
		productos_cantidad_stock.put("Yogures", 15);
		productos_cantidad_stock.put("Manzanas", 20);
		productos_cantidad_stock.put("Galletas", 9);
		productos_cantidad_stock.put("Baguette", 12);
		productos_cantidad_stock.put("Pizza", 18);
		productos_cantidad_stock.put("Lomo", 7);
		productos_cantidad_stock.put("Huevos", 11);
		productos_cantidad_stock.put("Arroz", 13);
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES 
		Hashtable<String, Integer> productos_cantidad_stock = new Hashtable <>();
		Hashtable<String, Double> precio_productos_stock = new Hashtable <>();
		Hashtable<String, Integer> productos_cantidad_carrito = new Hashtable <>();
		Scanner teclado = new Scanner (System.in);
		double precioT;
		double IVA;
		double precioIVA;
		double efectivo = 20;
		
		añadirPCstock (productos_cantidad_stock);
		añadirPPstock (precio_productos_stock);
		
		añadirPCcarrito (productos_cantidad_carrito);
		añadirPPcarrito (productos_cantidad_carrito, precio_productos_stock);
				
		precioT = precio_total (productos_cantidad_carrito, precio_productos_stock);
		IVA = IVA (precioT);
		precioIVA = precioIVA (precioT, IVA);
		
		//MOSTRAR RESULTADOS
		System.out.println("IVA Aplicado: " + IVA);
		System.out.println("Precio total bruto: " + precioT);
		System.out.println("Precio más IVA: " + precioIVA);
		System.out.println("Nº de productos comprados: " + productos_cantidad_carrito.size());
		System.out.println("Efectivo: " + efectivo);
		System.out.println("Cambio a devolver: " + (efectivo - precioIVA));
		System.out.println();
		System.out.println("STOCK DE LOS PRODUCTOS AHORA:");
		restar_stock (productos_cantidad_stock, productos_cantidad_carrito);
		
		teclado.close();

	}

}
