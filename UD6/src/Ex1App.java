import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex1App {
	
	public static int cuadrado () {
		String l = JOptionPane.showInputDialog("¿Cuánto mide el lado del cuadrado?");
		int lado = Integer.parseInt(l);
		int area;
		
		//Área cuadrado = lado * lado
		area = lado * lado;
		
		return (area);
	}
	
	public static int triangulo () {
		String b = JOptionPane.showInputDialog("¿Cuánto mide la base del triangulo?");
		String a = JOptionPane.showInputDialog("¿Cuánto mide la altura del triangulo?");
		int base = Integer.parseInt(b);
		int altura = Integer.parseInt(a);
		int area;
		
		//Área triangulo = (base * altura) / 2
		area = ((base * altura) / 2);
		
		return (area);
	}
	
	public static double circulo () {
		String respuesta = JOptionPane.showInputDialog("¿Cuánto mide el radio del circulo?");
		double radio = Double.parseDouble(respuesta);
		final double pi = 3.14;
		double area;
		
		//Área circulo = (radio^2)*PI
		area = ((Math.pow(radio, 2) * pi));
		
		return (area);
		
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES 
		String figura = JOptionPane.showInputDialog("¿Circulo, cuadrado o triangulo?");
		double aCirculo, aTriangulo, aCuadrado;
		
		//Switch con el procedimiento que hay que hacer dependiendo de la respuesta anterior.
		switch (figura) {
		case "circulo": aCirculo = circulo ();
			  JOptionPane.showMessageDialog(null, "El área del circulo és = " + aCirculo);
		break;
		case "triangulo": aTriangulo = triangulo ();
			  JOptionPane.showMessageDialog(null, "El área del triangulo és = " + aTriangulo);
		break;
		case "cuadrado": aCuadrado = cuadrado ();
			  JOptionPane.showMessageDialog(null, "El área del cuadrado és = " + aCuadrado);
		break;
		default: JOptionPane.showMessageDialog(null,"Introduce una respuesta válida");
		}

	}

}
