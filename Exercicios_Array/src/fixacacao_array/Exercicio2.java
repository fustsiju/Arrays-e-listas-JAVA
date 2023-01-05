package fixacacao_array;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor 


import java.util.Scanner;
import fix.Fix2;
public class Exercicio2 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		
		Fix2 fix = new Fix2();
		System.out.println("Insira o valor de N valores: ");
		int n = num.nextInt();
		fix.getN();
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = num.nextInt();
		}
		
		
		System.out.println(fix.calcValores(n, vetor));
		
		
		num.close();
	}
}
