package Ex1;

public class MainElectrodomesticosApp {

	public static void main(String[] args) {
		//Creamos el array de 10 posiciones
		Electrodomestico electrodomesticos [] = new Electrodomestico [10];
		//Creamos las demás variables
		int sumaLavadora = 0;
		int sumaElectrodomestico = 0;
		int sumaTelevision = 0;
		
		electrodomesticos [0] = new Lavadora (100, "Blanco", 'A', 50, 0, 40);
		electrodomesticos [1] = new Electrodomestico (50, "Rojo", 'B', 5, 0);
		electrodomesticos [2] = new Television (150, "Negro", 'C', 20, 0, 45, true);
		electrodomesticos [3] = new Television (150, "Azul", 'D', 15, 0, 20, false);
		electrodomesticos [4] = new Lavadora (200, "Gris", 'A', 100, 0, 40);
		electrodomesticos [5] = new Electrodomestico (50, "Blanco", 'E', 30, 0);
		electrodomesticos [6] = new Electrodomestico (70, "Azul", 'F', 25, 0);
		electrodomesticos [7] = new Television (120, "Blanco", 'B', 50, 0, 35, true);
		electrodomesticos [8] = new Lavadora (100, "Negro", 'C', 70, 0, 35);
		electrodomesticos [9] = new Electrodomestico (170, "Gris", 'A', 100, 0);
		
		for (Electrodomestico e : electrodomesticos){
			if (e instanceof Lavadora) {
				sumaLavadora += e.precioFinal();
			}
			if (e instanceof Electrodomestico) {
				sumaElectrodomestico += e.precioFinal();
			}
			if (e instanceof Television) {
				sumaTelevision +=  e.precioFinal();;
			}
			System.out.println(e.toString());
			System.out.println();
	}
		System.out.println("El precio de todas las lavadoras és = " + sumaLavadora);
		System.out.println("El precio de todos los electrodomésticos és = " + sumaElectrodomestico);
		System.out.println("El precio de todas las televisiones és = " + sumaTelevision);
		
			
		}
		
	}

