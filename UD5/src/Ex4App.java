import javax.swing.JOptionPane;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex4App {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		String radio = JOptionPane.showInputDialog("Introduce el radio del circulo:");
		final double pi = 3.14;
		
		//MOSTRAR RESULTADOS
		double radioD = Double.parseDouble(radio);
		JOptionPane.showMessageDialog(null, "El área del circulo és: " + (pi * (Math.pow(radioD, 2))));
		

	}

}
