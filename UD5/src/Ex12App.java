import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex12App {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		String contraseña = "idominguez";
		int intentos = 1;
		boolean acierto = false;
		Scanner teclado = new Scanner (System.in);
		
		String password = JOptionPane.showInputDialog("Introduce la contraseña: ");
		
		while (intentos < 3) { 		
		if (contraseña.equals(password)) {
			JOptionPane.showMessageDialog(null, "ENHORABUENA!");
			acierto = true;
			break;
		}
		else {
			intentos++;
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta.");
			password = JOptionPane.showInputDialog("Introduce la contraseña: ");
		}

		if (intentos >= 3 && acierto == false) {
			JOptionPane.showMessageDialog(null, "Has agotado los intentos.");
		}
	}

		teclado.close();
	}
}
