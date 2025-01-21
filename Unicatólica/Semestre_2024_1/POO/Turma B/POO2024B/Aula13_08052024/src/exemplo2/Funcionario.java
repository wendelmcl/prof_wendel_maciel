package exemplo2;

public abstract class Funcionario {
	private String nome;
	private int idade;
	
	public void imprimirInformacoes() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
	}
	public abstract int incremetaIdade(int idade);
	
	public void Teste() {
		System.out.println("Testando...");
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
