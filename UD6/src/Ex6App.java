import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex6App {
	
	public static int contar_cifras (int num) {
		String cifras = Integer.toString(num);
		
		return (cifras.length());
	}

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		String numero = JOptionPane.showInputDialog("Introduce un número:");
		int num = Integer.parseInt(numero);
		int numCifras = contar_cifras (num);

		//MOSTRAR RESULTADOS
		JOptionPane.showInternalMessageDialog(null, "El número tiene " + numCifras + " cifras.");
	}

}
