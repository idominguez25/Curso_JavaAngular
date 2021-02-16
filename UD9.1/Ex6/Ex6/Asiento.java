package Ex6;

public class Asiento {

    /*Atributos*/
    private char letra;
    private int fila;
    protected boolean ocupado; // informacion del espectador que esta sentado, null si es vacio

    /*Constructores*/
    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.ocupado = false; //al iniciar el asiento, no habrÃ¡ nadie sentado
    }

    /*Metodos*/
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	/**
     * Indica si el asiento esta ocupado
     *
     * @return
     */
    public boolean ocupado() {
    	ocupado = true;
        return ocupado;
    }

    @Override
    public String toString() {
        if (ocupado = true) {
            return "Asiento: " + fila + letra + " ocupado." ;
        }
        else {
        return "Asiento: " + fila + letra + " está vacío. ";
        }
    }

}