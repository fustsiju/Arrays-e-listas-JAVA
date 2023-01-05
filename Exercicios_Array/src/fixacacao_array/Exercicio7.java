package fixacacao_array;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
	mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
	os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/


import fix.Fix7;

public class Exercicio7 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		Fix7 fix = new Fix7();
		
		System.out.println("Insira o tamanho N do vetor: ");
		int n = num.nextInt();
		fix.setN(n);
		
		System.out.println("Insira os valores a serem adicionados ao vetor: ");
		double[] vetor = new double[n];
		for(int i = 0; i < n; i++) {
			vetor[i] = num.nextDouble();
		}
		
		fix.mediaVetor(vetor, n);
		
		
		num.close();
	}
}
