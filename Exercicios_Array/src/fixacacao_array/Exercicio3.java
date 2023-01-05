package fixacacao_array;

import java.util.Scanner;

import fix.Fix3;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
* tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
* bem como os nomes dessas pessoas caso houver.  
*/

public class Exercicio3 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		Fix3 fix = new Fix3();
		System.out.println("Insira a quantidade N de pessoas a serem digitadas: ");
		int n = num.nextInt();
		fix.setN(n);
		
		int[] vetorI = new int[n]; //Vetor de idade
		String[] vetorN = new String[n]; //Vetor de nomes
		double[] vetorA = new double[n];  //Vetor de altura
		
		for(int i = 0; i < n; i++) {
			System.out.println("Insira o nome: ");
			vetorN[i] = num.next();
			System.out.println("Insira a idade: ");
			vetorI[i] = num.nextInt();
			System.out.println("Insira a altura: ");
			vetorA[i] = num.nextDouble();
		}
		
		
		System.out.println(fix.calcMedia(vetorA));
		System.out.println(fix.porcentIdade(vetorN, vetorI, n));
		
		num.close();
	}
}
