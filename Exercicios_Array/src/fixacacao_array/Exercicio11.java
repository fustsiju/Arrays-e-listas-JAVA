package fixacacao_array;

import java.util.Scanner;

import fix.Fix11;

/* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. 
*/

public class Exercicio11 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int n = num.nextInt();

		double[] vetorA = new double[n];
		double[] vetorAM = new double[n];
		int h = 0;
		int m = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %d pessoa: ", i + 1);
			vetorA[i] = num.nextDouble();
			System.out.printf("Genero da %d pessoa (M, F): ", i + 1);
			char gen = num.next().charAt(0);
			if (gen == 'F') {
				vetorAM[i] = vetorA[i];
				m++;
			} else if (gen == 'M') {
				h++;
			}
		}

		Fix11 fix = new Fix11(n, vetorA, vetorAM, m);

		fix.menorAlt(vetorA);
		fix.maiorAlt(vetorA);
		fix.calcMediaM(n, vetorAM, m);
		System.out.println("Numero de homens: " + h);
		num.close();
	}

}
