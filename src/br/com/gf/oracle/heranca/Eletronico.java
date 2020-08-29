package br.com.gf.oracle.heranca;

public class Eletronico {
	int tensao = 0;
	
	public void ligar() {
		System.out.println("Eletrico ligado");
	}

	public void desligar() {
		System.out.println("Eletrico desligado");
	}
	
	public void tensao(int tensao) {
		this.tensao = tensao;
		System.out.println( "tensao/Voltagem: " + this.tensao + "\n");
				
	}
}
