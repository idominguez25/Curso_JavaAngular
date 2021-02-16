package Ex3;

import Excepcion.MiExcepcion;

public class Ex3App {

	public static void main(String[] args) {
		//Generamos un número aleatorio.
		int num = (int)(Math.random()*999+1);
		//Si el número es par nos mostrará un mensaje, si es impar nos mostará otro.
		try {
			System.out.println("Generando número aleatorio...");
			System.out.println("El número aleatorio és: " + num );
			
			if (num % 2 == 0) {throw new MiExcepcion(024);}
			else {throw new MiExcepcion(135);}
		}
		catch (MiExcepcion ex){
			System.out.println(ex.getMessage());
		}
	}

}
