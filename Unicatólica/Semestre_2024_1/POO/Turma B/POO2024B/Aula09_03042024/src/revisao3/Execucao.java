package revisao3;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		p1.setNome(sc.next());
		System.out.println("Digite sua idade: ");
		p1.setIdade(sc.nextInt());
		System.out.println("Digite seu CPF: ");
		p1.setCpf(sc.next());
		
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Idade: "+p1.getIdade());
		System.out.println("CPF: "+p1.getCpf());
	}
}
