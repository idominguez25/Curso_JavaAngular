package Ex2;

public class Videojuego implements Entregable{
	//Atributos 
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;
	
	//Constantes
	private final int horasEstimadas_DEF = 10;
	private final boolean entregado_DEF = false;
	
	//Constructores
	//Constructor por defecto
	public Videojuego() {
		this.titulo = null;
		this.horasEstimadas = horasEstimadas_DEF;
		this.entregado = entregado_DEF;
		this.genero = null;
		this.compañia = null;
	}

	//Constructor con el titulo y las horas estimadas
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	//Constructor con todos los atributos, excepto entregado
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}
	
	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	//Métodos de la interfaz
	@Override
	public boolean entregar() {
		entregado = true;
		return entregado;
	}

	@Override
	public boolean devolver() {
		entregado = false;
		return entregado;
	}

	@Override
	public void isEntregado() {
		System.out.println("Entregado: " + entregado);
	}
	
	//Método toString
	@Override
	public String toString() {
		return "[titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

}
