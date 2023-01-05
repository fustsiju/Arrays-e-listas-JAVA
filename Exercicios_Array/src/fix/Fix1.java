package fix;

public class Fix1 {
	private int vetor;
	private int tam;

	public Fix1(int vetor) {
		this.vetor = vetor;
	}

	public Fix1() {

	}

	public int getVetor() {
		return vetor;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public void setVetor(int i) {
		this.vetor = i;
	}

	public int verificaNegativos(int[] vetor) {
		int n = 0;
		for (int i = 0; i < tam; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
				n++;
			}
		}
		System.out.println("Quantidade de números negativos: ");
		return n;
	}

}
