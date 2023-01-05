package fixacacao_array;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. 
*/

import java.util.Scanner;
import fix.Fix6;

public class Exercicio6 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);

		Fix6 fix = new Fix6();

		System.out.println("Insira o valor de N: ");
		int n = num.nextInt();
		fix.setN(n);

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		System.out.println("Insira os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vetorA[i] = num.nextInt();
		}

		System.out.println("Insira os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			vetorB[i] = num.nextInt();
		}

		System.out.println("Vetor resultante C:");
		fix.geraVetorC(vetorA, vetorB, vetorC);

		num.close();
	}
}
