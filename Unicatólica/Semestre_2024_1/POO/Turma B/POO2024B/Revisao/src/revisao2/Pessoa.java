package revisao2;

public abstract class Pessoa {
	private String nome;
	private int idade;
	
	public abstract void imprimirInformacoes();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
