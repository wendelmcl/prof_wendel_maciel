package exemplo1;

public class Funcionario {
	private String nome;
	private int idade;
	
	public void imprimirInformacoes() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
	}
	
	public int incrementaIdade(int idade) {
		return idade = idade+1;
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
