package NovosTalentos2018;

public class Questao5 {
	private int numeroConta;
	private String nomeCorrentista;
	private double saldo;

	public Questao5(int numeroConta, String nomeCorrentista, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	public String AlterarNomeCorrentista(String nomeCorrentista) {
		return this.nomeCorrentista = nomeCorrentista;
	}

	public void Deposito(double valor) {
		this.saldo += valor;
	}

	public void Saque(double valor) {
		this.saldo -= valor;
	}
}
