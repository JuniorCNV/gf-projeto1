package br.com.gf.oracle.heranca;

public class EletronicoTeste {
	public static void main(String[] args) {
		Eletronico e = new Eletronico();
		e.ligar();
		e.desligar();
		e.tensao(127);

		Celular cl = new Celular();
		cl.ligar();
		cl.desligar();
		cl.tensao(127);

		Modem md = new Modem();
		md.ligar();
		md.desligar();
		md.tensao(127);

		Computador pc = new Computador();
		pc.ligar();
		pc.desligar();
		pc.tensao(220);
	}

}
