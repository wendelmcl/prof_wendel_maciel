package aula05_05032024;
import java.util.Scanner;
public class Execucao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = 0.0; 
		double n2 = 0.0;
		Aluno aluno = new Aluno();
		System.out.println("Digite seu nome: ");
		aluno.setNome(sc.next());
		System.out.println("Digite sua matrícula: ");
		aluno.setMatricula(sc.nextInt());
		
		System.out.println("Digite a N1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a N2: ");
		n2 = sc.nextDouble();
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Matrícula: " + aluno.getMatricula());
		System.out.println("Média: " + aluno.calcularMedia(n1, n2));
		
		System.out.println(aluno.toString());

	}
}
