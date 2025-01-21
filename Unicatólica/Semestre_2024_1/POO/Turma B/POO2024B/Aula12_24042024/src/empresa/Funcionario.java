package empresa;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public double bonificacao() {
		return this.salario * 0.10;	
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
