package Ex4;

public class MainRaicesApp {

	public static void main(String[] args) {
	// declaramos las variables con los parametros necesarios para realizar los
	// calculos

	double a = 1;
	double b = -5;
	double c = 6;
	char signoNegativo = '-';

	// imprimimos el valor del discriminante

	System.out.println("El discriminante es: " + Raices.getDiscriminante(a, b, c, signoNegativo) + " por lo tanto: ");

	// usamos un condicional en funcion de si la ecuacion tiene una raiz o dos
	if (Raices.tieneRaiz(a, b, c, signoNegativo)) {

		System.out.println("La ecuacion tiene una raiz \nEl resultados es:  ");

	} else {
		System.out.println("La ecuacion tiene dos raices \nLos resultados son: ");
	}

	// llamamos al metodo Calcular para que realice el calculo final
		Raices.Calcular(a, b, c, signoNegativo);

		

	}

}