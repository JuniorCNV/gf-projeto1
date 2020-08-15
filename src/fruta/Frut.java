package fruta;

public class Frut {
	private String nome;
	private double preco;
	private double unidade;

	public Frut(String nome, double preco, double unidade) {
		this.nome = nome;
		this.preco = preco;
		this.unidade = unidade;

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nom) {
		this.nome = nom;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getUnidade() {
		return this.unidade;
	}

	public void setUnidade(double unidade) {
		this.unidade = unidade;
	}

	public void sttsAtual() {
		System.out.println("\t Fruta: " + this.nome + "\n" + "\t Preço: R$" + this.preco + "\n"
				+ "\t quantidade disponível: " + this.unidade + "Kg");

	}

}
