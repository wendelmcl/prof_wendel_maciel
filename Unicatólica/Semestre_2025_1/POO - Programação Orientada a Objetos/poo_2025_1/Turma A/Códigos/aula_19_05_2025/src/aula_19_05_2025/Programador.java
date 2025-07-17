package aula_19_05_2025;

public class Programador extends Funcionario{
	private int horasTrabalhadas;
	
	public Programador(String nome, double salarioBase, int horasTrabalhadas) {
		super(nome, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() * horasTrabalhadas;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
}