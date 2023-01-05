package fixacacao_array;

import java.util.Scanner;

/* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
*/

import fix.Fix8;

public class Exercicio8 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		
		Fix8 fix = new Fix8();
		
		System.out.println("Quantos elementos tera o vetor: ");
		int n = num.nextInt();
		fix.setN(n);
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o numero: ");
			vetor[i] = num.nextInt();
		}
		
		fix.calcMedia(vetor, n);
		
		num.close();
	}
}
