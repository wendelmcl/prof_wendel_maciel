package collections;

public class Aluno implements Pessoa{
	private int id;
	private String nome;
	private int idade;
	@Override
	public int calcularIdade() {
		this.idade = this.idade + 1;
		return this.idade;
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
