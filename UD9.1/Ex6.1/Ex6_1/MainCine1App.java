package Ex6_1;

public class MainCine1App {

	public static void main(String[] args) {
		//Creamos el cine y la pelicula
		Pelicula pelicula = new Pelicula ("Lucy", 1.35, 12, "Steven Spellverg");
		Cine cine = new Cine (pelicula.getTitulo(), 5);
		
		System.out.println(pelicula.toString());
		System.out.println(cine.toString());
		
		Metodos.generarEspectadores();
		
		int filaAleatoria = Metodos.generaNumeroEnteroAleatorio(0, cine.getSala().length - 1);
        char letraAleatoria = (char) Metodos.generaNumeroEnteroAleatorio('A', 'A' + (cine.getSala()[0].length -1));
        
		//if ((Metodos.hayAsiento(filaAleatoria, letraAleatoria, cine.sala)) && (Metodos.puedeSentarse(null))){
			
        //}
        
	}

}
