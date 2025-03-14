package projeto_pessoa;

public class Pessoa {
	String nome;
	String cpf;
	int idade;
	
	public void imprimir_dados() {
		System.out.println("Nome: " + nome + "\nCPF: " + cpf
				+ "\nIdade: " + idade);
	}
	
	public void estudar() {
		System.out.println(nome + " está estudando...");
	}
	public void correr() {
		System.out.println(nome + " está correndo...");
	}
}
