package fruta;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("quantas frutas quer adicionar ao estoque?");
		int quantidadeFt = Integer.parseInt(sc.nextLine());

		Frut ft[] = new Frut[quantidadeFt];

		for (int i = 0; i < quantidadeFt; i++) {
			System.out.println("Insira o nome da " + (i + 1) + "° fruta:");
			String nome = sc.next();
			System.out.println("Insira o preço da " + (i + 1) + "° fruta referente à um quilo:");
			double preco = sc.nextDouble();
			System.out.println("Insira a quantidade em quilos referente da " + (i + 1)
					+ "° fruta que deseja adicionar em seu estoque: \n \t SOMENTE O (OS) NÚMERO (OS)");
			double unidade = sc.nextDouble();

			ft[i] = new Frut(nome, preco, unidade);
			ft[i].sttsAtual();
		}

		for (int i = 0; i < quantidadeFt; i++) {
			System.out.println(i + 1 + "° Fruta:");
			ft[i].sttsAtual();
		}

		sc.close();
	}
}
