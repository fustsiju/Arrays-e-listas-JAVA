package fixacacao_array;

import fix.Fix1;
// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		System.out.println("Insira um valor N: (Maximo 10) ");
		Fix1 fix = new Fix1();
		int tam = num.nextInt();
		fix.setTam(tam);
		int[] vetor = new int[tam];

		for (int i = 0; i < tam; i++) {
			System.out.println("Digite um numero: ");
			fix.setVetor(num.nextInt());
			vetor[i] = fix.getVetor();
		}

		System.out.println("Numeros Negativos: ");
		System.out.println(fix.verificaNegativos(vetor));

		num.close();
	}
}
