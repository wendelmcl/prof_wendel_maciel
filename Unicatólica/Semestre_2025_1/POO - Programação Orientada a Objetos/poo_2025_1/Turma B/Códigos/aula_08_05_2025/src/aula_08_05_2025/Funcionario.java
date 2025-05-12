package aula_08_05_2025;

public class Funcionario extends Pessoa{
	private double salario;
	private String cargo;
	
	public void exibir_dados() {
		super.exibir_dados();
		System.out.println("\nSalário: "+salario+""
				+ "\nCargo: "+cargo);
	}
	
	public double calcular_salario(){
		return salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
