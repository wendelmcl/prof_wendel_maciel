package aula04_27022024;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		int correndo = 0; int estudando = 0;
		int lendo = 0;
		System.out.println("Digite seu nome: ");
		p1.nome = sc.next();
		System.out.println("Digite sua idade: ");
		p1.idade = sc.nextInt();
		System.out.println("Digite sua altura: ");
		p1.altura = sc.nextDouble();
		
		System.out.println("Usuário está correndo? - 1 - Sim / 0 - Não: ");
		correndo = sc.nextInt();
		System.out.println("Usuário está estudando? - 1 - Sim / 0 - Não: ");
		estudando = sc.nextInt();
		System.out.println("Usuário está lendo? - 1 - Sim / 0 - Não: ");
		lendo = sc.nextInt();
		
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		System.out.println("Altura: " + p1.altura);
		
		p1.correr(correndo);
		p1.estudar(estudando);
		p1.ler(lendo);
		System.out.println("#####################");

	}
}
;