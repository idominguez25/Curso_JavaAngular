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
	
	//Constantes
	protected final double precioBase_DEF = 100;
	protected final String color_DEF = "Blanco";
	protected final char consumoEnergetico_DEF = 'F';
	protected final double peso_DEF = 5;
	
	//Constructor por defecto
	public Electrodomestico() {
		this (0, "", 'f', 0);
	}
	
	//Constructor con el precio base y el peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase_DEF;
		this.peso = peso_DEF;
	}

	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		super();
		this.precioBase = precioFinal(consumoEnergetico, peso, precioBase);
		this.color = comprobarColor(color, color_DEF);
		this.consumoEnergetico =  comprobarConsumoEnergetico (consumoEnergetico, consumoEnergetico_DEF);
		this.peso = peso;
	}
	
	//Método para comprobar el color
	private String comprobarColor (String color, String color_DEF) {
			if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||
				color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azúl") ||
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
	private double precioFinal(char consumoEnergetico, double peso, double precioBase) {
		switch (consumoEnergetico) {
		case 'A': precioBase += 100;
		break;
		case 'B': precioBase += 80;
		break;
		case 'C': precioBase += 60;
		break;
		case 'D': precioBase += 50;
		break;
		case 'E': precioBase += 30;
		break;
		case 'F': precioBase += 10;
		break;
		}
		
		if (peso >= 80) {
			precioBase += 100;
		}
		else if (peso >= 50) {
			precioBase += 80;
		}
		else if (peso >= 20) {
			precioBase += 50;
		}
		else if (peso >= 0) {
			precioBase += 10;
		}
		
		return (precioBase);
	}
	
	//Métodos get
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

	//Subclase
public class Lavadora extends Electrodomestico {
	//Atributo
	protected double carga;
		
	//Constante
	protected final double carga_DEF = 5;

	//Constructor por defecto
	public Lavadora() {
		this.carga = 0;
	}
	
	//Constructor con el precio y el peso
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	//Constructor con la carga y todos los atributos heredados
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga_DEF;
	}

	//Métodos get
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	//Llamamos al método precioFinal para actualizarlo
	public double precioFinal (double precioBase, char consumoEnergetico, double peso) {
		super.precioFinal(consumoEnergetico, peso, precioBase);
		if (carga > 30) {
			precioBase += 50;
		}
		return precioBase;
	}
}
	@Override
	public String toString() {
		return "Electrodomestico [precio final=" + precioBase + ", color=" + color + ", consumo energético="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
}