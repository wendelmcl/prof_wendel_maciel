package revisao01;

public class Gerente extends Funcionario{
	private double salario;
	
	@Override
	public void imprimirInformacoes() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("CPF: "+ this.getCpf());
		System.out.println("Salário: "+this.salario);
		System.out.println("\n");
	}
	
	@Override
	public double calcularSalario() {
		this.salario = this.salario + 100;
		return this.salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
