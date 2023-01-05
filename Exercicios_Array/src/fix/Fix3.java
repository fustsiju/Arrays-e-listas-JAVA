package fix;

public class Fix3 {
	private int n;
	private String nome;
	private int idade;
	private double altura;
	private double[] vetorA;
	private String[] vetorN;
	private int[] vetorI;

	public Fix3() {

	}

	public Fix3(int n, String nome, int idade, double altura, double[] vetorA, String[] vetorN, int[] vetorI) {
		this.n = n;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.vetorA = vetorA;
		this.vetorN = vetorN;
		this.vetorI = vetorI;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getVetorA() {
		return vetorA;
	}

	public void setVetorA(double[] vetorA) {
		this.vetorA = vetorA;
	}

	public String[] getVetorN() {
		return vetorN;
	}

	public void setVetorN(String[] vetorN) {
		this.vetorN = vetorN;
	}

	public int[] getVetorI() {
		return vetorI;
	}

	public void setVetorI(int[] vetorI) {
		this.vetorI = vetorI;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcMedia(double[] vetorA) {
		double media = 0;
		for (int i = 0; i < n; i++) {
			media += vetorA[i];
		}
		System.out.print("A media entre as alturas é de: ");
		return media / n;
	}

	public double porcentIdade(String[] nome, int[] vetorI, int idade) {
		double quant = 0;
		double porcent = 0;
		for (int i = 0; i < n; i++) {
			if (vetorI[i] < 16) {
				System.out.println(nome[i]);
				quant++;
			}
			porcent = (quant/n) * 100;
		}
		System.out.printf("Pessoas com menos de 16 anos: %.2f porcento\n" , porcent);
		System.out.print("Quantidade de pessoas com menos de 16: ");
		return (int) quant;
	}
}
