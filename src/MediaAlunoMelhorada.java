import java.util.Scanner;


public class MediaAlunoMelhorada {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double  nota1, nota2, nota3, nota4;
			
			String nome = sc.next();
			
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			nota4 = sc.nextDouble();
			
			double soma = nota1 + nota2 + nota3 + nota4;
				System.out.println( "aluno: " + nome );
				System.out.println("Media " + soma /4);
				sc.close();
		}
}