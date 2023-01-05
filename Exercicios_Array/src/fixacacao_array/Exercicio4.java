package fixacacao_array;

import java.util.Scanner;
import fix.Fix4;

/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
* tela todos os números pares, e também a quantidade de números pares.   
 */

public class Exercicio4 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		
		Fix4 fix = new Fix4();
		System.out.println("Informe N inteiros: ");
		int n = num.nextInt();
		fix.setN(n);
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = num.nextInt();
		}
		System.out.println("Numeros pares: ");
		System.out.println(fix.contaPares(n, vetor));
		
		num.close();
	}
}
