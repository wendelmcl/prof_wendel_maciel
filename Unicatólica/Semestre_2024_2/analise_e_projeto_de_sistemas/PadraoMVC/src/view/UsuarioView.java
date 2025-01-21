package view;

import java.util.Scanner;

public class UsuarioView {
	Scanner sc = new Scanner(System.in);
	public String getNome() {
		System.out.println("Digite seu nome: ");
		return sc.next();
	}
	
	public int getIdade() {
		System.out.println("Digite sua idade: ");
		return sc.nextInt();
	}
	
	public String getEmail() {
		System.out.println("Digite seu email: ");
		return sc.next();
	}
	
	public String getTelefone() {
		System.out.println("Digite seu telefone: ");
		return sc.next();
	}
	
	public void exibirUsuario(String nome, int idade, String email, String telefone) {
		System.out.println("Usuário: "+ nome + ", Idade: " + idade + ", E-mail: "+ email + ", Telefone: "+telefone);
	}
}
