import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex5App {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		String numero = JOptionPane.showInputDialog("Introduce un número: ");

		//MOSTRAR RESULTADOS
		int numeroI = Integer.parseInt(numero);
		
		if (numeroI % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El número és divisible por 2.");
		}
		else {
			JOptionPane.showMessageDialog(null, "El número no és divisible por 2.");
		}
	}

}
