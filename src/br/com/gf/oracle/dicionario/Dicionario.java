package br.com.gf.oracle.dicionario;

public class Dicionario {
	private static final int QUANTIDADE_PALAVRAS = 4;

	Palavra palavras[] = new Palavra[QUANTIDADE_PALAVRAS];

	public void iniciar2() {
		palavras[0] = new Palavra("arroz",
				"O arroz é uma planta da família das gramíneas que alimenta mais da metade da população humana do mundo.");
		palavras[1] = new Palavra("feijao",
				"Feijão é um nome comum para uma grande variedade de sementes de plantas de alguns gêneros da família Fabaceae.");
		palavras[2] = new Palavra("abelha",
				"Feijão é um nome comum para uma grande variedade de sementes de plantas de alguns gêneros da família Fabaceae.");
		palavras[3] = new Palavra("bolo",
				"Feijão é um nome comum para uma grande variedade de sementes de plantas de alguns gêneros da família Fabaceae.");
	}

	public String encontrar(String palavra) {
		String texto = "Palavra nao encontrada";
		for (int i = 0; i < QUANTIDADE_PALAVRAS; i++) {
			if (palavras[i].getPalavra().equals(palavra)) {
				texto = "Palavra: " + palavras[i].getPalavra() + "\n" + palavras[i].getFrase();
				break;
			}
		}
		return texto;
	}
}
