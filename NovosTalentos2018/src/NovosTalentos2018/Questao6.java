package NovosTalentos2018;

import javax.swing.JOptionPane;

public class Questao6 {
	public static void main(String[] args) {
		double base = 0;
		double altura = 0;
		String aux = "";

		aux = JOptionPane.showInputDialog("Informe o altura do local: ");
		altura = Double.parseDouble(aux);

		aux = JOptionPane.showInputDialog("Informe a largura do local: ");
		base = Double.parseDouble(aux);

		Questao6Retangulo ret = new Questao6Retangulo(base, altura);

		JOptionPane.showMessageDialog(null, " Você precisará de " + ret.CalcArea() + " m² de piso " + "\n E de "
				+ ret.CalcPerimetro() + " m² de rodapé ", "Orçamento", 1);
	}
}
