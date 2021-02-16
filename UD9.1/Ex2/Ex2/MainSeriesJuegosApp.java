package Ex2;

public class MainSeriesJuegosApp {

	public static void main(String[] args) {
		//Creamos los dos vectores
		Serie [] series = new Serie [5];
		Videojuego [] videojuegos = new Videojuego [5];
		
		//Llenamos los vectores
		Metodos.llenarVectores (series, videojuegos);
		
		//Entregamos algunas series y videojuegos
		Metodos.SeriesVideojuegosEntregados(series, videojuegos);
		
		//Contar cuantas series y videojuegos hay entregados
		Metodos.contarSeriesVideojuegos(series, videojuegos);
	
		//Mostrar el videojuego que tenga más horas estimadas y la serie que tenga más temporadas
		Metodos.masHoras_temporadas(videojuegos, series);
	}
}
		
