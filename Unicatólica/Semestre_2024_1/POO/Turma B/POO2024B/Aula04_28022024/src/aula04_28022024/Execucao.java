package aula04_28022024;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		int estudar, correr, comer;
		System.out.println("Digite sua seu nome: ");
		p1.nome = sc.next();
		System.out.println("Digite sua idade: ");
		p1.idade = sc.nextInt();
		System.out.println("Digite sua altura: ");
		p1.altura = sc.nextDouble();
		
		System.out.println("Usuário estudando? 0 - Não / 1 - Sim: ");
		estudar = sc.nextInt();
		System.out.println("Usuário correndo? 0 - Não / 1 - Sim: ");
		correr = sc.nextInt();
		System.out.println("Usuário comendo? 0 - Não / 1 - Sim: ");
		comer = sc.nextInt();
		
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		System.out.println("Altura: " + p1.altura);
		
		p1.estudar(estudar);
		p1.correr(correr);
		p1.comer(comer);
	}
}
