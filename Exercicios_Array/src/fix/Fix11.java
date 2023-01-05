package fix;

public class Fix11 {
	private int n;
	private double[] vetorA;
	private double[] vetorAM;
	private int m;

	public Fix11() {

	}

	public Fix11(int n, double[] vetorA, double[] vetorAM, int m) {
		this.n = n;
		this.vetorA = vetorA;
		this.vetorAM = vetorAM;
		this.m = m;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double[] getVetorA() {
		return vetorA;
	}

	public void setVetorA(double[] vetorA) {
		this.vetorA = vetorA;
	}

	public double[] getVetorAM() {
		return vetorAM;
	}

	public void setVetorAM(double[] vetorAM) {
		this.vetorAM = vetorAM;
	}

	public double menorAlt(double[] vetorA) {
		double pos = vetorA[0];

		for (int i = 0; i < n; i++) {
			if (vetorA[i] < pos) {
				pos = vetorA[i];
			}
		}
		System.out.printf("Menor altura: %.2f%n", pos);
		return pos;
	}

	public double maiorAlt(double[] vetorA) {
		double pos = vetorA[0];

		for (int i = 0; i < n; i++) {
			if (vetorA[i] > pos) {
				pos = vetorA[i];
			}
		}
		System.out.printf("Maior altura: %.2f%n", pos);
		return pos;
	}

	public double calcMediaM(int n, double[] vetorAM, int m) {
		double media = 0;
		double soma = 0;
		for (int i = 0; i < vetorAM.length; i++) {
			soma += vetorAM[i];
			media = soma / m;
		}
		System.out.printf("Media das alturas das mulheres: %.2f%n", media);
		return media;
	}

}
