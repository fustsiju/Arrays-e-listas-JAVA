package calc;

public class Matematica {
	private double a;
	private double b;
	private double c;
	private double t;
	private double soma;
	private double x;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public int getSoma() {
		return (int) soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public Matematica() {
	}

	public Matematica(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	// Dado os valores de a, b e c retorna o descrmininante (delta).

	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	public double somaN(double[] vetor, double t) {
		for (int i = 0; i < t; i++) {
			vetor[i] = t;
		}
		return t;
	}

	public int somaVet(double[] vetor, double t) {
		for (int i = 0; i < t; i++) {
			soma += vetor[i];
		}
		return (int) (soma * t);
	}

	public double getRoot1() {
		return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);

	}

	public double getRoot2() {
		return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
	}

}
