package aluno;
import java.util.Scanner;

public class Execucao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno(a): ");
		a1.nome = sc.nextLine();
		System.out.println("Digite a matrícula: ");
		a1.matricula = sc.nextInt();
		System.out.println("Digite a nota1: ");
		a1.n1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		a1.n2 = sc.nextDouble();
		
		a1.imprimir_dados();
		System.out.println(a1.nome + " média: " + a1.calcular_media());
		a1.verificar_resultado();
		
		
	}
}
