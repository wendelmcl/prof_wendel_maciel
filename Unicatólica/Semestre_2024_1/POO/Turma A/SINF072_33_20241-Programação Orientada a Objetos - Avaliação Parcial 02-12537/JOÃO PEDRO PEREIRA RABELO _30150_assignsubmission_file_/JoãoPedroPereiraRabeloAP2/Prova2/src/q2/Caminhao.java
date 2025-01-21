package q2;

public class Caminhao implements Veiculo{
	private String nome;

	public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
	@Override
	public void acelerar() {
		System.out.println("Caminhao esta acelerando");
		
	}

	@Override
	public void frear() {
		System.out.println("Caminhao esta freando");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Caminhao esta fazendo barulho");
		
	}

}
