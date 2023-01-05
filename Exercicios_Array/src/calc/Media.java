package calc;

public class Media {
	private double altura;
	private double preco;
	private String nome;
	private double soma;
	private double media;
	private double valor;

	public void calc_Vet(double[] vetor, int n) {
		for(int i = 0; i < n; i++) {
			vetor[i] = vetor[i] * n;
			System.out.println(vetor[i]);
		}
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public  double calc_Media(double[] precos, int n, String[] nome) {
		for(int i = 0; i < n; i++) {
			soma += precos[i];
			System.out.println(nome[i]);
		}
		double mediacalc = soma/n;
		
		System.out.printf("O valor da média entre os vetores é: ");
		return mediacalc;
	}
	
	public Media(double altura, double preco, String nome, double soma, double media, double valor) {
		this.altura = altura;
		this.preco = preco;
		this.nome = nome;
		this.soma = soma;
		this.media = media;
		this.valor = valor;
	}
	
	
	public Media() {
		
	}
	

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
