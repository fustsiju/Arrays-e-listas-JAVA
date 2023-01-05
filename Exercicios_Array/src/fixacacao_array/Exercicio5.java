package fixacacao_array;

import java.util.Scanner;
import fix.Fix5;
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
* o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
* considerando a primeira posição como 0 (zero). 
*/

public class Exercicio5 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		Fix5 fix = new Fix5();
		
		System.out.println("Insira a quantidade N de elementos: ");
		int n = num.nextInt();
		fix.setN(n);
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = num.nextInt();
			fix.setVetor(vetor);
		}
		
		fix.maiorValor(n, vetor);
		
		num.close();
	}
}
