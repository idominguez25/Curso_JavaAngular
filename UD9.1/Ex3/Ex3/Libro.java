package Ex3;

public class Libro {
	//Atributos
	private String ISBN = "0-0000-0000-0";
	private String titulo;
	private String Autor;
	private int numPaginas;
	
	//Constructor
	public Libro(String iSBN, String titulo, String autor, int numPaginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		Autor = autor;
		this.numPaginas = numPaginas;
	}
	
	//Getters & Setters
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	//Mostrar por pantalla
	@Override
	public String toString() {
		return "El libro con ISBN " + ISBN + ", creado por el autor " + Autor + ", tiene " + numPaginas + " páginas]";
	}	
	
}