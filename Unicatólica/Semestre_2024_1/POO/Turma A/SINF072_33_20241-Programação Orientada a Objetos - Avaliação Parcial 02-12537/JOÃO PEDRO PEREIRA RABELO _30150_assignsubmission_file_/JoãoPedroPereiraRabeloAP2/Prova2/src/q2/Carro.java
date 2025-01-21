package q2;

public class Carro implements Veiculo{
private String nome;

	public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

	@Override
	public void acelerar() {
		System.out.println("Carro esta acelerando");
		
	}

	@Override
	public void frear() {
		System.out.println("Carro esta freando");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Carro esta fazendo barulho");
		
	}

}
