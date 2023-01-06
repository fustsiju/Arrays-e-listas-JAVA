package fixacao_matrizes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);

		System.out.println("Insira a quantidade de linhas: ");
		int m = num.nextInt();
		System.out.println("Insira a quantidade de colunas: ");
		int n = num.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Informe o valor da linha %d coluna %d: \n", i, j);
				matriz[i][j] = num.nextInt();
			}
		}
		
		System.out.println("Informe o X:");
		int x = num.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) { 
				if (x == matriz[i][j]) {
					System.out.println("Posicao: " + "[" + i + "][" + j + "]");
					
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}

				}
			}
		}

		num.close();
	}
}
