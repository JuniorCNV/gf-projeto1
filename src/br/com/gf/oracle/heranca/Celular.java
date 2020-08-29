package br.com.gf.oracle.heranca;

public class Celular extends Eletronico {
	@Override
	public void ligar() {
		System.out.println("Celular ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Celular desligado");
	}

}
