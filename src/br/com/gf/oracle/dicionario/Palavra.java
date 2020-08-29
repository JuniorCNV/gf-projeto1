package br.com.gf.oracle.dicionario;

public class Palavra {

	private String palavra= "oi";
	private String significado;
	private String frase;

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public Palavra(String palavra, String frase) {
		super();
		this.palavra = palavra;
		this.frase = frase;
	}

}
