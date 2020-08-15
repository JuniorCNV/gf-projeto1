package br.com.gf.oracle.projeto1.tela;

import java.util.Scanner;

public class TelaPrincipal {

	
	public void exibir() {
		int opcao;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite 1 para codigos das frutas , 0 para finalizar ");
			opcao = sc.nextInt();//opcao do usuario
			
			switch (opcao) {
			case 0: break;
			case 1: 
				TelaVenda.exibir();
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		} while(opcao != 0);
		sc.close();
	}
	
	
	public static void main(String[] args) {
		
		new TelaPrincipal().exibir();	
			
	}
	
	
}
