package aula05_06032024;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("",0);
		Scanner sc = new Scanner(System.in);
		double n1 = 0.0, n2 = 0.0;
		System.out.println("Digite seu nome: ");
		aluno.setNome(sc.next());
		System.out.println("Digite sua matrícula: ");
		aluno.setMatricula(sc.nextInt());
		System.out.println("Digite N1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite N2: ");
		n2 = sc.nextDouble();
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Matrícula: " + aluno.getMatricula());
		System.out.printf("Média: %.2f", aluno.calcularMedia(n1, n2));
	}
}