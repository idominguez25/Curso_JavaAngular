package Ex4;

public class Raices {
	// Creamos sus Atributos
	protected double a;
	protected double b;
	protected double c;
	protected char signoInicial;

	// Creamos su Constructor donde asignaremos a nuestro objeto los valores antes
	// mencionados
	public Raices(double a, double b, double c, char signoInicial) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.signoInicial = signoInicial;
	}

	// Creamos los getters
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public char getSignoNegativo() {
		return signoInicial;
	}

	// Creamos los setters
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void setsignoInicial(char signoInicial) {
		this.signoInicial = signoInicial;
	}

	// Creamos los siguientes metodos:

	// Un metodo de tipo double y publico para calcular el "discrimiante"
	// discriminante representa el calculo de (b^2)-(4ac)

	public static double getDiscriminante(double a, double b, double c, char signoNegativo) {

		double exp = 2;
		double discriminante = (Math.pow(b, exp) - (4 * a * c));

		return discriminante;

	}

	// Un metodo de tipo booleano que nos determinara si la ecuacion tiene una raiz
	public static boolean tieneRaiz(double a, double b, double c, char signoNegativo) {

		double tieneRaiz = getDiscriminante(a, b, c, signoNegativo);

		// Si el determinante es = 0, la ecuacion tendra una solucion
		if (tieneRaiz == 0)
			return true;

		return false;
	}

	// Un metodo de tipo booleano que nos determinara si la ecuacion tiene dos
	// raices
	public static boolean tieneRaices(double a, double b, double c, char signoNegativo) {

		double tieneRaices = getDiscriminante(a, b, c, signoNegativo);

		// Si el determinante es mayor o = 0, la ecuacion tendra dos soluciones
		if (tieneRaices >= 0)
			return true;

		return false;

	}

	/*
	 * Al resolver una ecuación de segundo grado, pueden ocurrir 3 cosas:
	 * 
	 * Existen 2 valores para la variable que satisfacen la ecuación. Existe una
	 * única solución. La solución no pertenece al conjunto de los números Reales.
	 * 
	 * 
	 */

	// el siguiente metodo nos permitira obtener el valor de la ecuacion
	// y en caso de que la solucion tenga solo un valor podremos imprimirlo mediante
	// este metodo
	public static void obtenerRaiz(double a, double b, double c, char signoNegativo) {

		double discriminante = getDiscriminante(a, b, c, signoNegativo);

		double raizCuadradaDelDiscriminante = Math.sqrt(discriminante);

		// Si queremos saber cuanto da la raiz cuadrada del determinante habilitamos el
		// codigo siguiente:
		// System.out.println("raiz cuadrada del determinante: " +
		// raizCuadradaDelDiscriminante);

		// operacionA realiza el calculo del principio de la ecuacion antes de la raiz
		// y sin tomar en cuenta la division.

		double operacionA = 0;
		if (signoNegativo == '-')

			operacionA = 0 - b;

		// Si queremos saber el valor de la operacionA, habilitamos el codigo siguiente:
		// System.out.println("valor de la operacion A: " + operacionA);

		// realizamos la operacion final de la ecuacion:
		double operacionCompletaPositivo = (operacionA + raizCuadradaDelDiscriminante) / (2 * a);

		double operacionCompletaNegativo = (operacionA - raizCuadradaDelDiscriminante) / (2 * a);

		// Añadimos una condicion para determinar el valor
		// sabemos que si una ecuacion tiene una solucion es
		// porque ambas operaciones dan el mismo resultado
		// por lo tanto cuando estas coincidan se imprimira uno de los valores
		if (operacionCompletaPositivo == operacionCompletaNegativo)

			System.out.println("positivo: " + operacionCompletaPositivo);

	}

	// el siguiente metodo tambien nos permitira obtener el valor de la ecuacion
	// y en caso de que la solucion tenga dos valores podremos imprimirlos mediante
	// este metodo
	public static void obtenerRaices(double a, double b, double c, char signoNegativo) {

		// creamos variable para guardar el valor del metodo discriminante
		double discriminante = getDiscriminante(a, b, c, signoNegativo);

		// realizamos la raiz cuadrada del discriminante y lo guardamos en una variable
		double raizCuadradaDelDiscriminante = Math.sqrt(discriminante);

		// Si queremos saber cuanto da la raiz cuadrada del determinante habilitamos el
		// codigo siguiente:
		// System.out.println("raiz cuadrada del determinante: " +
		// raizCuadradaDelDiscriminante);

		// operacionA realiza el calculo del principio de la ecuacion antes de la raiz
		// y sin tomar en cuenta la division.
		double operacionA = 0;
		if (signoNegativo == '-')

			operacionA = 0 - b;

		// Si queremos saber el valor de la operacion A, habilitamos el codigo
		// siguiente:
		// System.out.println("valor de la operacion A: " + operacionA);

		// realizamos la operacion final de la ecuacion:
		double operacionCompletaPositivo = (operacionA + raizCuadradaDelDiscriminante) / (2 * a);
		double operacionCompletaNegativo = (operacionA - raizCuadradaDelDiscriminante) / (2 * a);

		// imprimimos los dos valores
		System.out.println("Usando el signo positivo: " + operacionCompletaPositivo);

		System.out.println("Usando el signo negativo: " + operacionCompletaNegativo);

	}

	// creamos un ultimo metodo para que automaticamente realice el calculo y nos de
	// el resultado correcto
	// determinando si la ecuacion tiene uno o dos raices
	// en cualquiera de los casos llama al metodo correspondiente encargado de
	// calcularlo
	public static void Calcular(double a, double b, double c, char signoNegativo) {

		if (tieneRaices(a, b, c, signoNegativo)) {

			obtenerRaices(a, b, c, signoNegativo);
		}
		else
			obtenerRaiz(a, b, c, signoNegativo);
	}

}
