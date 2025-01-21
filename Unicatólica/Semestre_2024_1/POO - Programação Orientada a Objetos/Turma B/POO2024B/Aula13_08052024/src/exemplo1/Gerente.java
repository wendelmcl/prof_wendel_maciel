package exemplo1;

public class Gerente extends Funcionario{
	private double salario;
	
	public void imprimirInformacoes() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Salário: "+this.salario);
	}
	
	public int incrementarIdade(int idade) {
		return idade = idade + 2;
	}
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
