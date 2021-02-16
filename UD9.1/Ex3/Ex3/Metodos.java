package Ex3;

public class Metodos {
	public static void masPaginas (Libro libro1, Libro libro2) {
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("El libro con más páginas és: " + libro1.getTitulo());
		}
		else {
			System.out.println("El libro con más páginas és: " + libro2.getTitulo());
		}
	}


}
