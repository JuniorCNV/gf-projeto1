package br.com.gf.oracle.dicionario;

import java.util.Scanner;

public class Teste2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Dicionario dc = new Dicionario();
		int i;
		dc.iniciar2();
		do {
			System.out.println("insira uma palavra");
			String palavra = sc.next().toLowerCase();
			System.out.println(dc.encontrar(palavra));
			System.out.println("digite 0 para sair ou 1 para procurar uma nova palavra!");
			i = sc.nextInt();
		} while (i >= 1);
		System.out.println("Finalizando");

		sc.close();
	}

}
