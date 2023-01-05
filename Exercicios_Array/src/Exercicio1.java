import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Insira a quantidade N de alturas a serem contabilizadas: ");
		int n = num.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < n; i++) {
			vetor[i] = num.nextDouble();
		}
		
		double soma = 0;
		
		for(int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		double media = soma/n;
		
		System.out.printf("Media: %.2f%n", media);
		
		num.close();
	}
}
