package Ex1;

public class Lavadora extends Electrodomestico {
	//Atributo
	private double carga;
		
	//Constante
	private final double carga_DEF = 5;

	//Constructor por defecto
	public Lavadora() {
		this.carga = carga_DEF;
	}
	
	//Constructor con el precio y el peso
	public Lavadora(double precioBase, double peso, double carga) {
		super(precioBase, peso);
		this.carga = carga;
	}

	//Constructor con la carga y todos los atributos heredados
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double precioFinal, double carga) {
		super(precioBase, color, consumoEnergetico, peso, precioFinal);
		this.carga = carga;
	}

	//Métodos getters y setters
	public double getCarga() {
		return carga;
	}
	
	public void setCarga(double carga) {
		this.carga = carga;
	}

	//Llamamos al método precioFinal para actualizarlo
	public double precioFinal () {
		super.precioFinal();
		if (carga >= 30) {
			precioFinal += 50;
		}
		return (precioFinal);
	}

	@Override
	public String toString() {
		return "Lavadora [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", precio final=" + precioFinal + ", carga=" + carga + "]";
	}

}