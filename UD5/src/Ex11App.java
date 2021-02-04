import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex11App {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		String dia = JOptionPane.showInputDialog("Introduce un día de la semana: ");
		
		//MOSTRAR RESULTADOS
		switch (dia) {
		case "Lunes": JOptionPane.showMessageDialog(null, "És un día laborable");
		break;
		case "Martes": JOptionPane.showMessageDialog(null, "És un día laborable");
		break;
		case "Miércoles": JOptionPane.showMessageDialog(null, "És un día laborable");
		break;
		case "Jueves": JOptionPane.showMessageDialog(null, "És un día laborable");
		break;
		case "Viernes": JOptionPane.showMessageDialog(null, "És un día laborable");
		break;
		case "Sábado": JOptionPane.showMessageDialog(null, "És un día laborable");
		break;
		case "Domingo": JOptionPane.showMessageDialog(null, "NO és un día laborable");
		break;
		default: JOptionPane.showMessageDialog(null, "ERROR! INTRODUCE UNA RESPUESTA VÁLIDA");
		}
	}

}
