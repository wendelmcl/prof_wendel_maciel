package empresa;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diretor d1 = new Diretor();
		Gerente g1 = new Gerente();
		System.out.println("##############DIRETOR##############");
		System.out.println("Digite seu ID: ");
		d1.setId(sc.nextInt());
		System.out.println("Digite seu nome: ");
		d1.setNome(sc.next());
		System.out.println("Salário: ");
		d1.setSalario(sc.nextDouble());
		
		System.out.println("##############GERENTE##############");
		System.out.println("ID: ");
		g1.setId(sc.nextInt());
		System.out.println("Nome: ");
		g1.setNome(sc.next());
		System.out.println("Salário: ");
		g1.setSalario(sc.nextDouble());
		
		System.out.println("##############DIRETOR##############");
		System.out.println("ID: "+d1.getId());
		System.out.println("Nome: "+d1.getNome());
		System.out.println("Salário: "+d1.getSalario());
		System.out.println("Salário + Bonificação: "+(d1.bonificacao()+d1.getSalario()));
		System.out.println("#################################");
		
		System.out.println("##############GERENTE##############");
		System.out.println("ID: "+g1.getId());
		System.out.println("Nome: "+g1.getNome());
		System.out.println("Salário: "+g1.getSalario());
		System.out.println("Salário + Bonificação: "+(g1.bonificacao()+g1.getSalario()));
		System.out.println("#################################");
		
		Gerente g2 = new Gerente();
		Funcionario f2 = g2;
		f2.setSalario(1000);
		System.out.println(f2.bonificacao());
	}
}
