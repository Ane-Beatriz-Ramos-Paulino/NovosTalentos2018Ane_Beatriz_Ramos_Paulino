package NovosTalentos2018;

import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {
		double tamanho = 0;
		double litros = 0;
		int latas = 0;
		double valor = 0;
		String aux = "";

		aux=JOptionPane.showInputDialog("Informe o tamanho em metros quadrados da �rea a ser pintada: ");
		tamanho = Double.parseDouble(aux);

		litros = tamanho / 3;

		latas = (int) Math.ceil(litros / 18);

		valor = latas * 80;

		JOptionPane.showMessageDialog(null,
				" Voc� precisar� de " + latas + " lata(s)" + "\n E o valor gasto ser� de R$ " + valor,
				"Or�amento", 1);

	}

}
