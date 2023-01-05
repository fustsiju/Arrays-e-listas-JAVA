package fix;

public class Fix9 {
	private int n;
	private int[] vetorI;
	private String[] vetorN;

	public Fix9() {

	}

	public Fix9(int n, int[] vetorI, String[] vetorN) {
		this.n = n;
		this.vetorI = vetorI;
		this.vetorN = vetorN;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getVetorI() {
		return vetorI;
	}

	public void setVetorI(int[] vetorI) {
		this.vetorI = vetorI;
	}

	public String[] getVetorN() {
		return vetorN;
	}

	public void setVetorN(String[] vetorN) {
		this.vetorN = vetorN;
	}

	public String pVelha(int[] vetorI, String[] vetorP) {
		int pos = vetorI[0];
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (vetorI[i] > pos) {
				pos = vetorI[i];
				cont = i;
			}
		}

		String nome = vetorP[cont++];
		System.out.print("Pessoa mais velha: " + nome);
		return nome;
	}

}
