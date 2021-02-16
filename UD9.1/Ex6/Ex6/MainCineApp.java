package Ex6;

import Ex6_1.Cine;

public class MainCineApp {

    public static void main(String[] args) {

        //Creo la pelicula
    	int fila = 8;
    	int columna = 9;
    	char letra;
        Pelicula pelicula = new Pelicula("Mi vida", 90, 16, "DDR");
        Cine cine = new Cine(5, pelicula, fila, columna);

        //Numero de espectadores que seran creados
        int numEspectadores =  Metodos.generaNumeroEnteroAleatorio(1, 30);

        System.out.println("Espectadores generados: ");
        //Termino cuando no queden espectadores o no haya mas sitio en el cine
        for (int i = 0; i < numEspectadores && cine.haySitio(); i++) {

            //Generamos un espectador
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
            

            //Mostramos la informacion del espectador
            
            //Generamos una fila y letra
            //Si esta libre continua sino busca de nuevo
           for (int k = 0; k < cine.getFilas()-1; k++) {
        	   for (char j = 'A'; j < cine.getColumnas()-1; j++) {
        		   while (cine.haySitio()) {
        			   for (Espectador e : espectadores)
        				   if (cine.sePuedeSentar(e)) {
        					   cine.sentar(k, j, e); //El espectador se sienta
                   }
        		   }
        	   }
            }
        }

        System.out.println("");
        cine.mostrar(); //Mostramos la informaciÃ³n del cine, tambien se puede usar un toString
}
}