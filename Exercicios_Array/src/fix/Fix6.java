package fix;

public class Fix6 {

	private int n;
	private int[] vetorA;
	private int[] vetorB;
	private int[] vetorC;

	public Fix6() {

	}

	public Fix6(int n, int[] vetorA, int[] vetorB, int[] vetorC) {
		this.n = n;
		this.vetorA = vetorA;
		this.vetorB = vetorB;
		this.vetorC = vetorC;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getVetorA() {
		return vetorA;
	}

	public void setVetorA(int[] vetorA) {
		this.vetorA = vetorA;
	}

	public int[] getVetorB() {
		return vetorB;
	}

	public void setVetorB(int[] vetorB) {
		this.vetorB = vetorB;
	}

	public int[] getVetorC() {
		return vetorC;
	}

	public void setVetorC(int[] vetorC) {
		this.vetorC = vetorC;
	}

	public int geraVetorC(int[] vetorA, int[] vetorB, int[] vetorC) {
		for (int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		return n;
	}

}
