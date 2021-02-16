package Ex6_1;

public class Metodos {
	
	public static void generarEspectadores() {
		Espectador [] espectadores = new Espectador [10];
        espectadores[0] = new Espectador("Julio", 12, Metodos.generaNumeroEnteroAleatorio(1, 20));
        espectadores[1] = new Espectador("Maria", 20, Metodos.generaNumeroEnteroAleatorio(1, 20) );
        espectadores[2] = new Espectador("David", 22, Metodos.generaNumeroEnteroAleatorio(1, 20));
        espectadores[3] = new Espectador("Ignacio", 16, Metodos.generaNumeroEnteroAleatorio(1, 20));
        espectadores[4] = new Espectador("Julia", 10, Metodos.generaNumeroEnteroAleatorio(1, 20));
        espectadores[5] = new Espectador("Carla", 8, Metodos.generaNumeroEnteroAleatorio(1, 20));
        espectadores[6] = new Espectador("Mercedes", 34, Metodos.generaNumeroEnteroAleatorio(1, 20));
        espectadores[7] = new Espectador("José", 41, Metodos.generaNumeroEnteroAleatorio(1, 20));
        espectadores[8] = new Espectador("Carlos", 27, Metodos.generaNumeroEnteroAleatorio(1, 20));
        espectadores[9] = new Espectador("Joaquin", 19, Metodos.generaNumeroEnteroAleatorio(1, 20));
	}
	
	  public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
	        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
	        return num;
	  }
	
	  public static void rellenaButacas(Asientos [][] sala) {
		  int fila = sala.length;
	        for (int i = 0; i < sala.length; i++) {
	            for (int j = 0; j < sala[0].length; j++) {
	                //Recuerda que los char se pueden sumar
	                sala[i][j] = new Asientos(fila, (char) ('A' + j));
	            }
	            fila--; //Decremento la fila para actualizar la fila
	        }
	  }
	  
	  public static void mostrarAsientos(Asientos[][] sala) {
	        for (int i = 0; i < sala.length; i++) {
	            for (int j = 0; j < sala[0].length; j++) {
	                System.out.println(sala[i][j]);
	            }
	            System.out.println("");
	        }

	    }
	  
	  public static boolean hayAsiento (int filaAleatoria, char letraAleatoria, Asientos [][] sala) {
		  if (sala[sala.length - filaAleatoria - 1][letraAleatoria - 'A'].isLibre());
		  System.out.println("Sitio libre!");
		  return true;
		  
	  }
	  
	  //public static boolean puedeSentarse(Espectador [] espectadores) {
		//  if (espectadores.tieneDinero() && espectadores.tieneEdad(Pelicula.getEdadMin()))
		//return false;
		  
	//  }
	
}
