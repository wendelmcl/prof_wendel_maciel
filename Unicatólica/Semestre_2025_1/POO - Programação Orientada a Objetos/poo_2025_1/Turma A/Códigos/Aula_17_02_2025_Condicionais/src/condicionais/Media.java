package condicionais;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		double nota1 = 0.0, nota2 = 0.0, soma = 0.0, media = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = sc.nextDouble();
		soma = nota1 + nota2;
		media = soma/2;
		System.out.println("Média: "+media);
		if(media >= 7.0) {
			System.out.println("Aluno(a) aprovado(a)");
		}else if(media >= 4.0 && media < 7.0) {
			System.out.println("Aluno(a) de AP3");
		}else {
			System.out.println("Aluno(a) reprovado(a)");
		}
	}
}
