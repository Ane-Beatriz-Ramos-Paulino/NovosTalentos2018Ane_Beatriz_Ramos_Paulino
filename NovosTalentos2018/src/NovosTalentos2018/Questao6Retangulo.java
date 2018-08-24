package NovosTalentos2018;

public class Questao6Retangulo {
	private double base;
	private double altura;

	public Questao6Retangulo() {

	}

	public Questao6Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double CalcArea() {
		return this.base * this.altura;
	}

	public double CalcPerimetro() {
		return (this.base * 2) + (this.altura * 2);
	}
}
