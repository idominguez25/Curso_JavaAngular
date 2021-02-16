package Ex1;
/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Electrodomestico {
	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	protected double precioFinal;
	
	//Constantes
	private final double precioBase_DEF = 100;
	private final String color_DEF = "Blanco";
	private final char consumoEnergetico_DEF = 'F';
	private final double peso_DEF = 5;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = precioBase_DEF;
		this.color = color_DEF;
		this.consumoEnergetico = consumoEnergetico_DEF;
		this.peso = peso_DEF;
		this.precioFinal = precioBase;
	}
	
	//Constructor con el precio base y el peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso, double precioFinal) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color, color_DEF);
		this.consumoEnergetico = comprobarConsumoEnergetico (consumoEnergetico, consumoEnergetico_DEF);
		this.peso = peso;
		this.precioFinal = precioFinal();
	}
	
	//Método para comprobar el color
	private String comprobarColor (String color, String color_DEF) {
			if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||
				color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") ||
				color.equalsIgnoreCase("gris")) {
				return color;
			}
			else {
				return color_DEF;
			}
	}
	
	//Método para comprobar el consumo energético
	private char comprobarConsumoEnergetico (char consumoEnergetico, char consumoEnergetico_DEF) {
		char [] valores = {'A','B','C','D','E','F'};
		boolean bien = false;
		
		for (int i = 0; i < valores.length; i++) {
		if (consumoEnergetico == valores[i]) {
			bien = true;
		}
		}
		
		if (bien == true) {
			return consumoEnergetico;
		}
		else {
			return consumoEnergetico_DEF;
		}
	}
	
	//Método para saber el precio final
	public double precioFinal() {
		
		precioFinal = precioBase;
		
		switch (consumoEnergetico) {
		case 'A': precioFinal += 100;
		break;
		case 'B': precioFinal += 80;
		break;
		case 'C': precioFinal += 60;
		break;
		case 'D': precioFinal += 50;
		break;
		case 'E': precioFinal += 30;
		break;
		case 'F': precioFinal += 10;
		break;
		}
		
		if (peso >= 80) {
			precioFinal += 100;
		}
		else if (peso >= 50) {
			precioFinal += 80;
		}
		else if (peso >= 20) {
			precioFinal += 50;
		}
		else if (peso >= 0) {
			precioFinal += 10;
		}
		
		return (precioFinal);
	}
	
	//Métodos getters y setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio base=" + precioBase + ", color=" + color + ", consumo energético="
				+ consumoEnergetico + ", peso=" + peso + ", precio final=" + precioFinal +"]";
	}
	
	
}