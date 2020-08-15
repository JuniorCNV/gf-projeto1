package sala;

public class SalaAulaTeste {
	public static void main(String[] args) {
	
		Aluno al = new Aluno();
		al.setNomeAluno("Junior");
		al.setNota1(7);
		al.setNota2(8);
		al.setNota3(9);
		
		
		System.out.println("O aluno: " + al.getNomeAluno() + " tem a media: " + al.media());
	}
	
}
