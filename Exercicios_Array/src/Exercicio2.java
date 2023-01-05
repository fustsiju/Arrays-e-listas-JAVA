import java.util.Scanner;

import calc.Media;


public class Exercicio2 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		Media media = new Media();
		System.out.println("Insira a quantidade n de produtos:");
		int n = num.nextInt();

		double[] precos = new double[n];
		String[] nomes = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Insira o nome do %d produto \n", i);
			media.setNome(num.next());
			nomes[i] = media.getNome();
			System.out.println("Insira seu valor: ");
			media.setPreco(num.nextDouble());
			precos[i] = media.getPreco();
		}
		
		System.out.println("Os itens são: ");
		System.out.println(media.calc_Media(precos, n, nomes));

		

		num.close();
	}
}
