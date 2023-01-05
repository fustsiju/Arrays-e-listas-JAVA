import java.util.Scanner;

import calc.Media;

// Crie um método na classe Média que recebe um vetor e seu tamanho e retorna um vetor onde cada item é a multiplicação
// dele mesmo pelo tamanho do mesmo

public class Exercicio_Art2 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		
		Media media = new Media();
		
		System.out.println("Insira o tamanho n do vetor:");
		int n = num.nextInt();
		
		double[] vetor = new double[n];
		
		System.out.println("Insira os valores do vetor:");
		for(int i = 0; i < n; i++) {
			media.setValor(num.nextDouble());
			vetor[i] = media.getValor();
		}
		System.out.println("Valores atualizados: ");
		System.out.println();
		
		num.close();
	}
}
