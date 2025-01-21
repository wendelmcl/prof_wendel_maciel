package aula04_28022024;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	
	public void estudar(int valor) {
		if(valor == 0) {
			System.out.println("Não está estudando...");
		}else if(valor == 1) {
			System.out.println("Estudando...");
	}else{
		System.out.println("Valor inválido...");
	}
}
	public void correr(int valor) {
		if(valor == 0) {
			System.out.println("Não está correndo...");
		}else if(valor == 1) {
			System.out.println("Correndo...");
		}else {
			System.out.println("Valor inválido...");
		}
	}
	public void comer(int valor) {
		if(valor == 0) {
			System.out.println("Não está comendo...");
		}else if(valor == 1) {
			System.out.println("Comendo...");
		}else{
			System.out.println("Valor inválido...");
		}
	}
}
