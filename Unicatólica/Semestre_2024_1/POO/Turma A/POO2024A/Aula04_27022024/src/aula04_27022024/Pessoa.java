package aula04_27022024;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	
	public void correr(int valor) {
		if(valor == 0) {
			System.out.println("A pessoa não está correndo...");
		}else if(valor == 1) {
			System.out.println("A pessoa está correndo...");
		}else {
			System.out.println("Valor inválido...");
		}
	}
	
	public void estudar(int valor) {
		if(valor == 0) {
			System.out.println("A pessoa não está lendo...");
		}else if(valor == 1) {
			System.out.println("A pessoa está estudando...");
		}else {
			System.out.println("Valor inválido...");
		}
	}
	
	public void ler(int valor) {
		if(valor == 0) {
			System.out.println("A pessoa não está lendo...");
		}else if(valor == 1) {
			System.out.println("A pessoa está lendo...");
		}else {
			System.out.println("Valor inválido...");
		}
	}
}
