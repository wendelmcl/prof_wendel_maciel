package revisao6;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		p1.setNome("Ana");
		p1.setIdade(30);
		p1.setCpf("0587896-62");
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Idade: "+p1.getIdade());
		System.out.println("CPF: "+p1.getCpf());
		
		System.out.println("######################");
		System.out.println("Digite seu nome: ");
		p2.setNome(sc.next());
		System.out.println("Digite sua idade: ");
		p2.setIdade(sc.nextInt());
		System.out.println("Digite seu CPF: ");
		p2.setCpf(sc.next());
		
		System.out.println("Nome: "+p2.getNome());
		System.out.println("Idade: "+p2.getIdade());
		System.out.println("CPF: "+p2.getCpf());
		
	}
}
