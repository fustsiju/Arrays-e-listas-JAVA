package fix;

public class Fix7 {
	private int n;
	private double[] vetor;
	private double mediaA;
	
	public Fix7() {
		
	}
	
	public Fix7(int n, double[] vetor, double mediaA) {
		this.n = n;
		this.vetor = vetor;
		this.mediaA = mediaA;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double[] getVetor() {
		return vetor;
	}

	public void setVetor(double[] vetor) {
		this.vetor = vetor;
	}

	public double getMediaA() {
		return mediaA;
	}

	public void setMediaA(double mediaA) {
		this.mediaA = mediaA;
	}
	
	public double mediaVetor(double[] vetor, double mediaA) {
		double soma = 0;
		for(int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		mediaA = soma / n;
		for(int i = 0; i < n; i++) {
			if(vetor[i] < mediaA) {
				System.out.println(vetor[i]);
			}
		}
		System.out.printf("Media do vetor: %.3f", mediaA);
		return mediaA;
	}
	
}
