package NovosTalentos2018;

import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		int horasTrabalhadas = 0;
		double salarioMinimo = 0;
		double vlrHorasTrabalhadas = 0;
		double salarioBruto = 0;
		double salarioAReceber = 0;
		double imposto = 0;
		String aux = "";

		aux = JOptionPane.showInputDialog("Informe o n�mero de horas trabalhadas: ");
		horasTrabalhadas = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog("Informe o valor do sal�rio m�nimo: ");
		salarioMinimo = Double.parseDouble(aux);


		vlrHorasTrabalhadas = salarioMinimo * 0.1;

		salarioBruto = horasTrabalhadas * vlrHorasTrabalhadas;

		imposto = salarioBruto * 0.03;

		salarioAReceber = salarioBruto - imposto;

		JOptionPane.showMessageDialog(null, "O sal�rio a receber �: " + salarioAReceber, "Sal�rio", 1);

	}

}
