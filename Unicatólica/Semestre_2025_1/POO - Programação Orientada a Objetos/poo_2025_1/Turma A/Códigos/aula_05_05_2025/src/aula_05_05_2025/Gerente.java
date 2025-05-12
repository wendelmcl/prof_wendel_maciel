package aula_05_05_2025;

public class Gerente extends Funcionario{
	
	void imprimir_salario() {
		double bonificacao = getSalario() * 0.10;
		setSalario(getSalario() + bonificacao);
		System.out.println("Salário: "+getSalario());
	}
}
