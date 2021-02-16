package Ex5;

import java.util.Random;

public class Metodos {
	public static String generarPassword(int longitud){
		// Array de posibles caracteres que contendrá la contraseña generada
		final char[] caracteres =
		{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
		'Q','R','S','T','U','V','W','X', 'Y','Z',
		'a','b','c','d','e','f','g','e','h','i','j','l','k','m',
		'n','o','p','r','s','t','u','v','w','x','y','z',
		'1','2','3','4','5','6','7','8','9','0',
		'@','#','!','$','€','&','[',']'};

		    // Esta cadena guardará al final del método la contraseña generada aleatoriamente
		    String temporal = "";
		
		    Random aleatorio = new Random();
		
		    // Iteramos tantas veces como longitud de caracteres debe tener la contraseña
		    for(int i = 0; i < longitud ; i++){
		        // En cada iteracción a la cadena temporal le asignamos el carácter
		        // asociado a la posición (generada aleatoriamente) del array caracteres
		        temporal += caracteres[aleatorio.nextInt(caracteres.length)];
		    }
		
		    return temporal;
	}
	
	public static void crearContraseñas (int longitud, int tamaño, Password[] contraseñas) {
		for (int i = 0; i < contraseñas.length; i++) {
			contraseñas[i] = new Password (longitud);
		}
	}
	
	public static void contraseñasFuertes (Password [] contraseñas, boolean [] contraseñaFuerte) {
		for (int i = 0; i < contraseñaFuerte.length; i++) {
			contraseñaFuerte[i] = esFuerte(contraseñas[i].contraseña);
		}
	}
	
	public static boolean esFuerte(String contraseña) {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		
		for (char c: contraseña.toCharArray ()){
			if (Character.isUpperCase(c)) {
				mayusculas++;
			}
			if (Character.isLowerCase(c)) {
				minusculas++;
			}
			if (c == '0' || c == '1' || c == '2' ||	c == '3' || c == '4' || c == '5' ||
				c == '6' || c == '7' || c == '8' || c == '9') {
				numeros++;
			}
		}
	
		if (mayusculas > 2 && minusculas > 1 && numeros >= 5) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void mostrarArray (Password [] contraseñas, boolean [] contraseñaFuerte) {
		for (int i = 0; i < contraseñas.length; i++) {
			System.out.println(contraseñas[i].toString() + " " + contraseñaFuerte[i]);
			}
	}
}