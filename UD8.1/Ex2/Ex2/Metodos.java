package Ex2;

import java.util.Random;

public class Metodos {
	public static String generarContraseña (int longitud) {
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

}
