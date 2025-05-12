package aula_05_05_2025;

public class Diretor extends Funcionario{
	
	public void imprimir_salario(){
		double bonificacao = getSalario() * 0.15;
		setSalario(getSalario()+bonificacao);
		System.out.println("\nSalário: "+getSalario());
	}
}
