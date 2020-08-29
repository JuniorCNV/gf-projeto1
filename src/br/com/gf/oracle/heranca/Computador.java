package br.com.gf.oracle.heranca;

public class Computador extends Eletronico {

	public void ligar() {
		System.out.println("Computador ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Computador desligado");
	}

}
