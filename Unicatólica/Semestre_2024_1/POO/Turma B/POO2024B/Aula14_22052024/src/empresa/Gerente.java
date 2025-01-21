package empresa;

public class Gerente implements Funcionario{
	private int id;
	private String nome;
	private double salario;
	
	@Override
	public void imprimirInformacoes() {
		System.out.println("ID: "+this.id);
		System.out.println("Nome: "+this.nome);
		System.out.println("Salário: "+this.salario);
	}
	@Override
	public double calcularSalario() {
		this.salario = this.salario + 100;
		return this.salario;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
