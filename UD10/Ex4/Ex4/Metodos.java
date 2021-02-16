package Ex4;

public class Metodos {
	//Sumar
	public static double suma (double a, double b) {
		return (a + b);
	}

	//Restar
	public static double resta (double a, double b) {
		return (a - b);
	}

	//Multiplicacion
	public static double multiplicacion (double a, double b) {
		return (a * b);
	}

	//División
	//La division por 0 en Java solo produce una excepción si es un int 0, en caso de
	//un double 0.0 da como resultado infinity, así que forzamos la Exception
	public static double division (double a, double b) {
		if (b == 0) throw new ArithmeticException();
		return (a / b);
	}

	//Potencia
	public static double potencia (double a, double b) {
		return (Math.pow(a, b));
	}

	//Raiz cuadrada
	//Es necesario que definamos una nueva excepcion porque el metodo Math.sqrt nos
	//devuelve NaN (numero imaginario)
	public static double raizCuadrada (double a) throws ExcepcionesCalculadora {
		double resultado = Math.sqrt(a);
		if (Double.isNaN(resultado)) throw new ExcepcionesCalculadora(1);	
		return resultado;
	}

	//Raiz cubica
	public static double raizCubica (double a) {
		return Math.cbrt(a);
	}

	//Modulo
	public static double modulo (double a, double b) {
		return (a % b);
	}

}
