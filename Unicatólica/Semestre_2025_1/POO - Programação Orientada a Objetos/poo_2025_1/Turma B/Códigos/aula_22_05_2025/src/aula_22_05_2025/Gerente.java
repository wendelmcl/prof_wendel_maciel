package aula_22_05_2025;

public class Gerente extends Funcionario{
	private int horas_trabalhadas;
	
	public Gerente(String nome, double salario, int horas_trabalhadas) {
		super(nome, salario);
		this.horas_trabalhadas = horas_trabalhadas;
	}

	@Override
	public double calcularSalario() {
		return getSalario() * horas_trabalhadas;
	}

	public int getHoras_trabalhadas() {
		return horas_trabalhadas;
	}

	public void setHoras_trabalhadas(int horas_trabalhadas) {
		this.horas_trabalhadas = horas_trabalhadas;
	}
}
