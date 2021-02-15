package Ex4;

public class Serie {
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

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	

}
