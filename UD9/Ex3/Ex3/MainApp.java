package Ex3;

public class MainApp {
	
	//Ejecutamos el método y nos mostrará la respuesta
	public static void masPaginas (Libro libro1, Libro libro2) {
		
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("El libro con más páginas és: " + libro1.getNumPaginas());
		}
		else {
			System.out.println("El libro con más páginas és: " + libro2.getTitulo());
		}
	}

	public static void main(String[] args) {
		//Objetos
		Libro libro1 = new Libro ("1-1234-5678-0", "He jugado con lobos", "Gabriel Janer Manilla", 128);
		Libro libro2 = new Libro ("0-4321-9876-1", "El niño con el pijama de rayas", "John Boyne", 217);
		
		//Imprimir datos de los objetos
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		//Llamamos al método para saber cuál de los dos tiene más páginas
		masPaginas (libro1, libro2);
		
	}

}
