package aula_05_05_2025;

public class Funcionario extends Pessoa{
	private int matricula;
	private String cargo;
	private double salario;
	
	void imprimir_dados() {
		System.out.println("\nNome: "+getNome()+""
				+ "\nIdade: "+getIdade()+""
				+ "\nCPF: "+getCpf()+""
				+ "\nMatrícula: "+matricula+""
				+ "\nCargo: "+cargo+""
				+ "\nSalário: "+salario);
		
	}
	
	void imprimir_salario() {
		System.out.println("Salário: "+salario);
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
