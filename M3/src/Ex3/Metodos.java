package Ex3;

import java.util.Scanner;

public class Metodos {
	
	public static void introducirDatos (Scanner teclado, String marcaRuedasDelanteras, double diametroRuedasDelanteras, String marcaRuedasTraseras, double diametroRuedasTraseras) {
		System.out.println("Introduce la marca de las ruedas delanteras:");
		marcaRuedasDelanteras = teclado.next();
		System.out.println("Introduce el diámetro de las ruedas delanteras:");
		diametroRuedasDelanteras = teclado.nextDouble();
		System.out.println("Introduce la marca de las ruedas traseras:");
		marcaRuedasTraseras = teclado.next();
		System.out.println("Introduce el diámetro de las ruedas traseras:");
		diametroRuedasTraseras = teclado.nextDouble();
	}
	
	public static String comprobarMatricula (String matricula, String matricula_DEF) {
		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			return matricula;
		}
		else {
			return matricula_DEF;
		}
	}
	public static double comprobarDiametroRuedasD (double diametroRuedasD, double diametroRuedasD_DEF) {
		if (diametroRuedasD > 0.4 && diametroRuedasD < 4) {
			return diametroRuedasD;
		}
		else {
			return diametroRuedasD_DEF;
		}
	}
	public static double comprobarDiametroRuedasT (double diametroRuedasT, double diametroRuedasT_DEF) {
		if (diametroRuedasT > 0.4 && diametroRuedasT < 4) {
			return diametroRuedasT;
		}
		else {
			return diametroRuedasT_DEF;
	}
	}
}
