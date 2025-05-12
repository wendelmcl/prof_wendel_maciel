package aula_08_05_2025;

public class Gerente extends Funcionario{
	
	private double bonificacao;
	
	public void exibir_dados() {
		super.exibir_dados();
		System.out.println("\nBonificação: "+bonificacao);
	}
	
	public double calcular_salario() {
		return getSalario() + bonificacao;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
}
