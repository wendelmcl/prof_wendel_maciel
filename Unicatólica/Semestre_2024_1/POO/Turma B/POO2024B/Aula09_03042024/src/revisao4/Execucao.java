package revisao4;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		g1.setNome(sc.next());
		System.out.println("Digite sua idade: ");
		g1.setIdade(sc.nextInt());
		System.out.println("Digite seu CPF: ");
		g1.setCpf(sc.next());
		System.out.println("Digite seu salário: ");
		g1.setSalario(sc.nextDouble());
		System.out.println("Digite sua matrícula: ");
		g1.setMatricula(sc.nextInt());
		
		System.out.println("Nome: "+g1.getNome());
		System.out.println("Idade: "+g1.getIdade());
		System.out.println("CPF: "+g1.getCpf());
		System.out.println("Salário: "+g1.getSalario());
		System.out.println("Matrícula: "+g1.getMatricula());
		
	}
}
