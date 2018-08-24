package NovosTalentos2018;
import javax.swing.*;

public class Questao2 {

	public static void main(String[] args) {
		int valorInicial = 0;
		int valorFinal = 0;
		
		String aux = "";

		aux = JOptionPane.showInputDialog("Informe o valor Inicial: ");
		valorInicial = Integer.parseInt(aux);
		aux = null;

		aux = JOptionPane.showInputDialog("Infome o valor Final: ");
		valorFinal = Integer.parseInt(aux);
		aux = "";

		for (int cont = valorInicial; cont <= valorFinal; cont++) {
			if (isPrimo(cont)) {
				aux = aux + cont + " ";
			}
		}
		
		JOptionPane.showMessageDialog(null, aux, "Números Primos", 1);
	}

	public static Boolean isPrimo(int numero) {
		int aux = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				aux++;
			}
		}

		return aux == 2;
	}
}
