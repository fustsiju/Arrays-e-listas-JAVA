package fix;

public class Fix5 {
	private int n;
	private int[] vetor;
	
	public Fix5() {
		
	}
	
	public Fix5(int n, int[] vetor){
		this.n = n;
		this.vetor = vetor;
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
	
	public int maiorValor(int n, int[] vetor) {
		int maior = vetor[0];
		int posicao = 0;
		for(int i = 1; i < n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println("O maior valor é: " + maior);
		System.out.println("A posição do maior valor é: " + posicao);
		return maior;
	}
}
