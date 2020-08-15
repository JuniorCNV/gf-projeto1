
public class Aluno {
	
	String nome;
	double nota1;
	int pesoN1;
	double nota2;
	int pesoN2;
	double nota3;
	int pesoN3;
	
	void calculoMediaAritimetica () {
		double media = (nota1 + nota2 + nota3)/3;
		System.out.println("Media aritmética: " + media);		
	}
	void calculoMediaPonderada() {
		double media = (nota1 *pesoN1 + nota2 *pesoN2 + nota3* pesoN3)/10;
		System.out.println("Media ponderada: " + media);		
	}
}
