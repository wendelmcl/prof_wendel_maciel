package q4;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente c1 = new Cliente();
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Digite seu e-mail: ");
		String email = sc.next();
		
		c1.setNome(nome);
			System.out.println("Digite seu nome: "+nome);
			c1.getNome();
		c1.setIdade(idade);
			System.out.println("Digite sua idade: "+idade);
			c1.getIdade();
		c1.setEmail(email);
			System.out.println("Digite seu E-mail: "+email);
			c1.getEmail();
			
		}

	

}
