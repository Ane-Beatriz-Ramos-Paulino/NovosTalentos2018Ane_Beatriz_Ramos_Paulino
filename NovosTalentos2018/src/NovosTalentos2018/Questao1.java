package NovosTalentos2018;
import java.text.DecimalFormat;

import javax.swing.*;
public class Questao1 {

	public static void main(String[] args) {
		
		double salario = 1000.00;
		double aumento = 1.5/100;
		DecimalFormat decimal= new DecimalFormat("0.00");
		
		for( int ano = 2006; ano < 2019; ano++) {
			
			salario=salario+(salario*aumento);
			aumento=aumento*2;
			System.out.println("O sal�rio do ano de " + ano + " � R$ " + decimal.format(salario));
		}
		//JOptionPane.showMessageDialog(null, "O Sal�rio atual do funcion�rio �: " + salarioAtual);
		
		
		
		
		

	}

}
