package Ex2;

public class Serie implements Entregable {
	//Atributos
	protected String titulo;
	protected int numTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	//Constantes
	private final int numTemporadas_DEF = 3;
	private final boolean entregado_DEF = false;
	
	//Constructores
	//Constructor por defecto
	public Serie() {
		this.titulo = null;
		this.numTemporadas = numTemporadas_DEF;
		this.entregado = entregado_DEF;
		this.genero = null;
		this.creador = null;
	}

	//Constructor con el titulo y el creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	//Constructor con todos los atributos, excepto entregado
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
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
		return "[titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}	
	
}
