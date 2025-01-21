package q2;

public class Motocicleta implements Veiculo{
	private String nome;

	public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
	@Override
	public void acelerar() {
		System.out.println("Motocicleta esta acelerando");
		
	}

	@Override
	public void frear() {
		System.out.println("Motocicleta esta freando");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Motocicleta esta fazendo barulho");
		
	}

}
