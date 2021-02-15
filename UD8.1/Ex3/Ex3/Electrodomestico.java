package Ex3;

public class Electrodomestico {
	//Atributos
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	//Constantes
	private final String color_DEF = "Blanco";
	private final char consumoEnergetico_DEF = 'F';
	private final int precioBase_DEF = 100;
	private final double peso_DEF = 5;
	
	//Constructores
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = precioBase_DEF;
		this.color = color_DEF;
		this.consumoEnergetico = consumoEnergetico_DEF;
		this.peso = peso_DEF;
	}

	//Constructor con el precio y el peso
	public Electrodomestico(int precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	//Constructor con todos los atributos
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor (color, color_DEF);
		this.consumoEnergetico = comprobarConsumo (consumoEnergetico, consumoEnergetico_DEF);
		this.peso = peso;
	}
	
	//Método para comprobar el color
	public String comprobarColor (String color, String color_DEF) {
		if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") ||
			color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") ||
			color.equalsIgnoreCase("Gris")) {
			return color;
		}
		else {
			return color_DEF;
		}
	}
	
	//Método para comprobar el consumo energético
	public char comprobarConsumo (char consumoEnergetico, char consumoEnergetico_DEF) {
		if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' ||
				consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F' ) {
			return consumoEnergetico;
		}
		else {
			return consumoEnergetico_DEF;
		}
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
}
