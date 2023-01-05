package fixacacao_array;

/* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). 
*/

import java.util.Scanner;

import fix.Fix10;

public class Exercicio10 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
	
		System.out.println("Quantos alunos serao digitados? ");
		int n = num.nextInt();

		String[] alunos = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o nome: ");
			alunos[i] = num.next();
			System.out.println("Digite a primeira nota: ");
			notas1[i] = num.nextDouble();
			System.out.println("Digite a segunda nota: ");
			notas2[i] = num.nextDouble();
		}
		
		Fix10 fix = new Fix10(n, alunos, notas1, notas2, alunos);
		
		fix.nomesAprov(n, notas1, notas2, alunos);
		
		num.close();
	}
}
