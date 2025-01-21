package revisao7;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Diretor d1 = new Diretor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome Gerente: ");
		g1.setNome(sc.next());
		System.out.println("Idade Gerente: ");
		g1.setIdade(sc.nextInt());
		System.out.println("CPF Gerente: ");
		g1.setCpf(sc.next());
		System.out.println("Salário Gerente: ");
		g1.setSalario(sc.nextDouble());
		System.out.println("Matrícula Gerente: ");
		g1.setMatricula(sc.nextInt());
		
		System.out.println("\n");
		
		System.out.println("Nome Gerente: "+g1.getNome());
		System.out.println("Idade Gerente: "+g1.getIdade());
		System.out.println("CPF Gerente: "+g1.getCpf());
		System.out.println("Salário Gerente: "+g1.getSalario());
		System.out.println("Matrícula Gerente: "+g1.getMatricula());
		
		System.out.println("\n");
		
		System.out.println("##########################");
		
		System.out.println("\n");
		
		System.out.println("Nome Diretor: ");
		d1.setNome(sc.next());
		System.out.println("Idade Diretor: ");
		d1.setIdade(sc.nextInt());
		System.out.println("CPF Diretor: ");
		d1.setCpf(sc.next());
		System.out.println("Salário Diretor: ");
		d1.setSalario(sc.nextDouble());
		System.out.println("ID Gerente: ");
		d1.setId(sc.nextInt());
		
		System.out.println("\n");
		
		System.out.println("Nome Diretor: "+d1.getNome());
		System.out.println("Idade Diretor: "+d1.getIdade());
		System.out.println("CPF Diretor: "+d1.getCpf());
		System.out.println("Salário Diretor: "+d1.getSalario());
		System.out.println("ID Diretor: "+d1.getId());
	}
}
