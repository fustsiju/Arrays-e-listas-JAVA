package calc;

public class Soma {
	private int valor;
	private int soma;

	public Soma(int valor, int soma) {
		this.soma = soma;
		this.valor = valor;
	}

	public Soma() {

	}

	public int calcValores(int[] vetor) {
		for (int i = 0; i < 3; i++) {
			soma += vetor[i];
		}

		System.out.println(soma);
		return soma;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

}
