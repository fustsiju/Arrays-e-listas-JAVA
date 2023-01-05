package fix;

public class Fix2 {
	private int n;
	private int[] vetor;
	
	public int[] getVetor() {
		return vetor;
	}
	
	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calcValores(int n, int[] vetor) {
		int soma = 0;
		double media = 0;
		System.out.print("Os valores dentro do vetor são: ");
		for(int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		for(int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		System.out.println("\nSoma: " + soma);
		System.out.print("Media: ");
		for(int i = 0; i < n; i++) {
			media = soma / n;
		}
		return (int) media;
	}
	
}
