import java.util.Scanner;

import calc.Matematica;

public class Exercicio_Art3 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);

		System.out.println("Enter the coefficients a, b, and c: ");
		double a = num.nextDouble();
		double b = num.nextDouble();
		double c = num.nextDouble();

		Matematica matematica = new Matematica(a, b, c);

		double t = a + b + c;
		double[] vetor = new double[(int) t];
		int soma = (int) t;

		matematica.setA(a);
		matematica.setB(b);
		matematica.setC(c);

		matematica.setSoma(soma);

		matematica.setT(t);

		System.out.println(matematica.somaVet(vetor, t));
		System.out.println(matematica.somaN(vetor, t));

		double discriminant = matematica.getDiscriminant();

		if (discriminant > 0) {
			System.out.println("The equation has two roots " + matematica.getRoot1() + " and " + matematica.getRoot2());
		} else if (discriminant == 0) {
			System.out.println("The equation has one root " + matematica.getRoot1());
		} else {
			System.out.println("The equation has no real roots");
		}

		double[] raiz = new double[2];

		raiz[0] = matematica.getRoot1();
		raiz[1] = matematica.getRoot2();

		for (int i = 0; i < 2; i++) {
			System.out.println(raiz[i]);
		}

		/*
		 * Agora, faça um programa que dado os 3 coeficients (a, b e c) faça: a) Crie um
		 * vetor de double do tamanho a + b + c e o preencha com os valores de a, b e c
		 * somados b) Na classe Matematica, crie um método que dado os valores de a b e
		 * c, retorna a soma de todos os elementos do vetor c) Na classe Matematica,
		 * crie um método que dado os valores de a b e c, retorna as duas raizes de uma
		 * equação de segundo grau em um vetor de duas posições
		 *
		 */

		num.close();
	}
}
