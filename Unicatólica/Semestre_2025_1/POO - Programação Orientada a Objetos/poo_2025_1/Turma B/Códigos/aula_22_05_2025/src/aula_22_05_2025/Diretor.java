package aula_22_05_2025;

public class Diretor extends Funcionario{
	private double bonificacao;
	
	public Diretor(String nome, double salario, double bonificacao) {
		super(nome, salario);
		this.bonificacao = bonificacao;
	}

	@Override
	public double calcularSalario() {
		return getSalario() + bonificacao;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
}
