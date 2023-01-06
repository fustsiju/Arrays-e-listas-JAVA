package fixacao_matrizes;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Insira o tamanho da matriz N");
		int n = num.nextInt();
		int k = 0;
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = num.nextInt();
			}
		}
		
		System.out.println("A diagonal pricipal: ");
		for(int i = 0; i < n; i++) {
			System.out.println(matriz[i][i]);	
			}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(matriz[i][j] < 0) {
					k++;
				}
			}
		}
		
		System.out.println("Quantidade de valores negativos: " + k);
		
		
		num.close();
	}
}
