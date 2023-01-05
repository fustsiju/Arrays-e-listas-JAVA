package fixacacao_array;

import java.util.Scanner;
import fix.Fix9;

/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. 
*/

public class Exercicio9 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		Fix9 fix = new Fix9();
		
		System.out.println("Quantas pessoas serao cadastradas?");
		int n = num.nextInt();
		fix.setN(n);
		
		int[] vetorI = new int[n];
		String[] vetorN = new String[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Insira os dados da %d pessoa\n", i);
			System.out.println("Insira o nome: ");
			vetorN[i] = num.next();
			System.out.println("Insira a idade: ");
			vetorI[i] = num.nextInt();
		}
		
		fix.pVelha(vetorI, vetorN);
		
		num.close();
	}
}
