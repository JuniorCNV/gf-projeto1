import java.util.Scanner;

public class Hortifruti {

	static void invalido(Scanner sc, int quant, String fruta) {
		String revalidar = null;
		if (quant > 10) {
			System.out.println(
					"Nao temos a quantia desejada!!! \nDeseja levar o total do estoque? \nDigite sim ou nao");
			String pergunta = sc.next();
			if (pergunta.equals("nao")) {
				System.out.println("Deseja outra quantidade? \nDigite sim ou nao");
				revalidar = sc.next();
			} else {
				double tudo = 10 * 0.50;
				System.out.println("total da compra: R$" + tudo);
				System.out.println("Obrigado, volte sempre!");
			}
			if (revalidar.equals("sim")) {

				System.out.println("Quantas " + fruta + " voce gostaria de comprar?");
				quant = sc.nextInt();
				while (quant > 10) {
					System.out.println("MANO TU É CHATO");
					System.out.println("SÓ TEMOS 10 "+ fruta + "\nQuantas " + fruta + " voce gostaria de comprar?");
					quant = sc.nextInt();
				}
				calculoDeFruta(sc, quant);
			}
		}
	}

	public static void calculoDeFruta(Scanner sc, double quant) {

		if (quant <= 10) {

			double compra = quant * 0.50;
			System.out.println("Sua compra deu um total de: R$" + compra + "\nObrigado! Volte sempre! ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bom dia, bem vindo ao Frufru \nQual? fruta voce gostaria? ");
		String fruta = sc.next();
		System.out.println("quantas " + fruta + " voce gostaria de comprar?");
		int quant = sc.nextInt();

		invalido(sc, quant, fruta);
		calculoDeFruta(sc, quant);

		sc.close();
	}

}
