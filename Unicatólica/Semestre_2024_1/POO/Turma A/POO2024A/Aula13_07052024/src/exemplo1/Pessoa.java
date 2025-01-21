package exemplo1;

public abstract class Pessoa {
	private String nome;
	private int idade;
	
	public void mover() {
		System.out.println("Movendo...");
	}
	
	public abstract int incrementarIdade();

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
