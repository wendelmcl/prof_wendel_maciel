package revisao01;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	
	public abstract double calcularSalario();
	public abstract void imprimirInformacoes();
	
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
}
