import java.util.Scanner;

public class Dificil {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			System.out.println("SIGA A ORDEM!!! Quantos alunos? Quantas notas? Nome dos alunos? Notas dos alunos?");

	//		int nAlunos = new QuantidadeAluno();
			
			
			int nAlunos = sc.nextInt();
			int nNotas = sc.nextInt();
			
			
			
if ( nAlunos   == 1 && nNotas == 2  )  {
	String nome = sc.next();
	
				double  n1, n2;
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				double soma = n1+n2;
			System.out.println( "A media do aluno "+ nome + " é " + soma/2);
				
			}
			
//if ( nAlunos   == 2 && nNotas == 2  )  {
//	String nome = sc.next();
//	String nome2 = sc.next();
//				double  nb2 = 0, nb1 = 0, na1= 0  , na2;
//				na1 = sc.nextDouble();
//				na2 = sc.nextDouble();
//				nb1 = sc.nextDouble();
//				nb2 = sc.nextDouble();
//				double soma1 = na1 + na2;
//				double soma2 = nb1 + nb2;
//			System.out.println( "A media do aluno "+ nome + " é " + soma1/2 );
//				System.out.println("A media do aluno " + nome2 +" é " + soma2/2);
//			}
			
			
	
			
			
			
			
			
			sc.close();
			
			
		}

}
