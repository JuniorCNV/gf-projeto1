
public class AlunosTeste {
	public static void main(String[] args) {
		Aluno al = new Aluno();
		al.nome = "Junior";
		al.nota1 = 7;
		al.nota2 = 8;
		al.nota3 = 9;
		
		al.calculoMediaAritimetica();
		
		Aluno al1 = new Aluno();
		al1.nome = "Junior";
		al1.nota1 = 7;
		al1.pesoN1 = 2;
		al1.nota2 = 8;
		al1.pesoN2 = 3;
		al1.nota3 = 9;
		al1.pesoN3 = 5;
		
		al1.calculoMediaPonderada();
		
		
		
	}

}
