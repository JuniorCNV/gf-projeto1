package br.com.gf.oracle.projeto1.tela;

import java.util.List;
import java.util.Scanner;

import br.com.gf.oracle.projeto1.model.Item;
import br.com.gf.oracle.projeto1.repositorio.ItemRepositorio;

public class TelaVenda {

	public static void exibir() {
		Scanner sc = new Scanner(System.in);

		
		int opcao =0;
		int quant =0;
		double compraTotal = 0;
		double compra = 0;
		ItemRepositorio bancoDadosItem = new ItemRepositorio();
		List<Item> items = bancoDadosItem.encontrarTodos();
		System.out.println("Insira o id da fruta desejada");
		do {
		
		for (int i = 0; i < items.size(); i++) {
			
			System.out.println(items.get(i).getId() + "\t" + items.get(i).getNome()+ "\t" + items.get(i).getValor());
	
			
		}
		
		opcao = sc.nextInt();
		System.out.println("quantidade do produto");
		quant = sc.nextInt();
		
		compra = items.get(opcao -1).getValor() * quant;
		compraTotal = compraTotal + compra;	
		System.out.println("1 para continuar comprando ou 0 para finalizar");
		opcao = sc.nextInt();
		}while(opcao != 0);
		
		
		System.out.println("TOTAL: R$" + compraTotal);
		

	

	}

}
