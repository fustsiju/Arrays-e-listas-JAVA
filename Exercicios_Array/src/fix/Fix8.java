package fix;

public class Fix8 {
	private int n;
	private int[] vetor;
	private double mediaP;

	public Fix8() {

	}

	public Fix8(int n, int[] vetor, double mediaP) {
		this.n = n;
		this.vetor = vetor;
		this.mediaP = mediaP;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public double getMediaP() {
		return mediaP;
	}

	public void setMediaP(double mediaP) {
		this.mediaP = mediaP;
	}

	public double calcMedia(int[] vetor, double mediaP) {
		double soma = 0;
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				cont++;
			}
		}
		mediaP = soma / cont;
		if (cont == 0) {
			System.out.println("NENUM NUMERO PAR!");
		} else {
			System.out.printf("Media dos pares: %.1f", mediaP);
		}

		return mediaP;
	}
}
