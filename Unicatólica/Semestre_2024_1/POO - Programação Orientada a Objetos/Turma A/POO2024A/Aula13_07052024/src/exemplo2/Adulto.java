package exemplo2;

public class Adulto implements Pessoa{
	private String nome="";
	private int idade=0;
	@Override
	public void mostrarInformações() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
	}

	@Override
	public int incrementarIdade() {
		return this.idade+1;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public void setIdade(int idade) {
		this.idade = idade;
		
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int getIdade() {
		return idade;
	}

}
