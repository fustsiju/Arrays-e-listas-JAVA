package fix;

public class Fix4 {
	private int n;
	private int[] vetor;
	
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

	public int contaPares(int n, int[] vetor) {
		int quant = 0;
		for(int i = 0; i < n; i++) {
			if(vetor[i] %2 == 0) {
				System.out.println(vetor[i]);
				quant++;
			}
		}
		System.out.print("\nQuantidade de numeros pares = ");
		return quant;
	}
	
}
