import java.util.Scanner;

import calc.Soma;
//Crie um método na classe Media que recebe 3 valores e retorna a soma deles

public class Exercicio_Art1 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		Soma soma = new Soma();
		System.out.println("Insira três valores:");

		int[] vetor = new int[3];

		for (int i = 0; i < 3; i++) {
			soma.setValor(num.nextInt());
			vetor[i] = soma.getValor();
		}

		soma.calcValores(vetor);

		num.close();
	}
}
