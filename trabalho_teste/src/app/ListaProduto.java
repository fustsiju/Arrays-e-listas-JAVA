package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;

public class ListaProduto {
	public static void menu() {
		System.out.println("--------------------------------");
		System.out.println("|      ESCOLHA UMA OPCAO       |");
		System.out.println("================================");
		System.out.println("|   1. Inserir no inicio       |");
		System.out.println("|   2. Inserir no final        |");
		System.out.println("|   3. Localizar Produto       |");
		System.out.println("|   4. Excluir Produto         |");
		System.out.println("|   5. Imprimir Lista          |");
		System.out.println("|   6. Quantidade de Produto   |");
		System.out.println("|   7. Sair                    |");
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {
		menu();
		int codigo = 0;
		String nome;
		float valor = 0;
		int quantidade = 0;
		int quantidadeM = 0;
		List<Produto> lista = new ArrayList<>();
		String[] nomes = new String[lista.size()];
		Produto prod = new Produto();
		Scanner num = new Scanner(System.in);
		int resp = num.nextInt();
		do {
			switch (resp) {
			case 1:
				System.out.print("Insira o codigo do produto: ");
				prod.setCodigo(num.nextInt());
				System.out.print("Insira o nome do produto: ");
				prod.setNomeProduto(num.next());
				System.out.print("Insira o valor do produto: ");
				prod.setValorProduto(num.nextFloat());
				System.out.print("Insira a quantidade de produtos: ");
				prod.setQuantidadeAtual(num.nextInt());
				System.out.print("Insira a quantidade minima: ");
				prod.setQuantidadeMinima(num.nextInt());
				
				lista.add(0, prod);
				break;
			case 2:
				System.out.print("Insira o codigo do produto: ");
				prod.setCodigo(num.nextInt());
				System.out.print("Insira o nome do produto: ");
				prod.setNomeProduto(num.next());
				System.out.print("Insira o valor do produto: ");
				prod.setValorProduto(num.nextFloat());
				System.out.print("Insira a quantidade de produtos: ");
				prod.setQuantidadeAtual(num.nextInt());
				System.out.print("Insira a quantidade minima: ");
				prod.setQuantidadeMinima(num.nextInt());
				
				lista.add(lista.size() - 1, prod);
				break;
			case 3:
				System.out.print("Insira o nome do produto que deseja localizar: ");
				Produto name = (Produto) lista.stream().filter(x -> x.getNomeProduto() == num.next());
				System.out.println(name);
				break;
			case 4:
				System.out.print("Insira o nome do produto que deseja excluir: ");
				Produto nomo = (Produto) lista.stream().filter(x -> x.getNomeProduto() == num.next());
				lista.remove(nomo);
				break;
			case 5:
				for (Produto x : lista) {
					System.out.println(x);
				}
				break;
			case 6:
				System.out.println("A quantidade de produtos atual é: " + lista.size());
				break;
			}
			menu();
			resp = num.nextInt();
		} while (resp != 7);
		System.exit(0);
		num.close();
	}
}
