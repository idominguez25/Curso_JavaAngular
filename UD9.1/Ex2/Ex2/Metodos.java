package Ex2;

public class Metodos {
	public static void llenarVectores (Serie [] series, Videojuego [] videojuegos) {
		//Series
		series [0] = new Serie ("La casa de papel", 4, "robo", "Álex Pina");
		series [1] = new Serie ("Prison Break", 5, "drama", "Paul Scheuring ");
		series [2] = new Serie ("Hache", 1, "suspenso", "Verónica Fernández");
		series [3] = new Serie ("You", 2, "suspenso", "Sera Gamble");
		series [4] = new Serie ();
		
		//Videojuegos
		videojuegos [0] = new Videojuego ("Grand Theft Auto V", 50, "aventura", "Rockstar North");
		videojuegos [1] = new Videojuego ("Fortnite",0, "acción", "Epic Games");
		videojuegos [2] = new Videojuego ("FIFA 21", 20, "fútbol", "EA Sports");
		videojuegos [3] = new Videojuego ("Assassin's Creed", 75, "acción-aventura", "Ubisoft Montreal");
		videojuegos [4] = new Videojuego ();
	}
	public static void SeriesVideojuegosEntregados (Serie [] series, Videojuego [] videojuegos) {
		series [0].entregar();
		series [1].entregar();
		series [3].entregar();
		videojuegos [1].entregar();
		videojuegos [3].entregar();
	}
	public static void contarSeriesVideojuegos (Serie [] series, Videojuego [] videojuegos) {
		//Contadores
		int contadorSeries = 0;
		int contadorVideojuegos = 0;
		
		//Recorremos el vector y contamos las series y los videojuegos que hayan entregados,
		//después los mostramos
		System.out.println("SERIES:");
		for (Serie i : series){
			if (i.entregado == true) {
				contadorSeries++;
				i.devolver();
				System.out.println(i.getTitulo());
			}
		}
		System.out.println("Se han entregado " + contadorSeries + " series.");
		System.out.println();
		
		System.out.println("VIDEOJUEGOS:");
			for (Videojuego j : videojuegos){
			if (j.entregado == true) {
				contadorVideojuegos++;
				j.devolver();
				System.out.println(j.getTitulo());
			}
		}
		System.out.println("Se han entregado " + contadorVideojuegos + " videojuegos.");
		System.out.println();
		
	}
	public static void masHoras_temporadas (Videojuego [] videojuegos, Serie [] series) {
		int horas = 0;
		int posicionV = 0;
		int posicionS = 0;
		int temporadas = 0;
		
		System.out.println("El videojuego con más horas estimadas és:");
		for (int i = 0; i < videojuegos.length; i++){
			if (videojuegos[i].horasEstimadas > horas) {
				horas = videojuegos[i].horasEstimadas;
				posicionV = i;
			}
		}
		System.out.println(videojuegos[posicionV].toString());
		
		System.out.println();
		System.out.println("La serie con más temporadas és:");
		for (int j = 0; j < series.length; j++){
			if (series[j].numTemporadas > temporadas) {
				temporadas = series[j].numTemporadas;
				posicionS = j;
			}
		}
		System.out.println(series[posicionS].toString());
	}
	
}
