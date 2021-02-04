import javax.swing.JOptionPane;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex1App {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int a = 50;
		int b = 50;
		
		//MOSTRAR RESULTADOS
		if (a > b) {
			JOptionPane.showMessageDialog(null, "El número más grande és: " + a);
		}
		else if (a == b) {
			JOptionPane.showMessageDialog(null, "Los dos números són iguales.");
		}
		else {
			JOptionPane.showMessageDialog(null, "El número más grande és: " + b);
		}

	}

}
