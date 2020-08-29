package br.com.gf.oracle.heranca;

public class Modem extends Eletronico {
	@Override
	public void ligar() {
		System.out.println("Modem ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Modem desligado");
	}

}
