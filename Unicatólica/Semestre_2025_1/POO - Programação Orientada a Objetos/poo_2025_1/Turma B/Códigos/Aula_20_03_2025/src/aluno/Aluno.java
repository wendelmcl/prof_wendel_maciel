package aluno;

public class Aluno {
	String nome;
	int matricula;
	double n1, n2;
	
	public void imprimir_dados() {
		System.out.println("\nNome: " + nome
				+ "\nMatricula: " + matricula 
						+ "\nNota1: " + n1
								+ "\nNota2: " + n2);
	}
	public double calcular_media() {
		double media = 0.0;
		media = (n1 + n2) / 2.0;
		return media;
	}
	public void verificar_resultado() {
		if(calcular_media() >= 7.0) {
			System.out.println(nome + " aprovado(a)");
		}else if(calcular_media() >= 4 && calcular_media() < 7) {
			System.out.println(nome + " ap3");
		}else {
			System.out.println(nome + " reprovado(a)");
		}
	}
}
