package revisao03;

public class Gerente implements Funcionario{
	private int id;
	private String nome;
	private String cpf;
	private double salario;
	
	@Override
	public double calcularSalario() {
		this.salario = this.salario + 100;
		return this.salario;
	}
	@Override
	public void imprimirInformacoes() {
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Salário: "+this.salario);
		System.out.println("\n");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
