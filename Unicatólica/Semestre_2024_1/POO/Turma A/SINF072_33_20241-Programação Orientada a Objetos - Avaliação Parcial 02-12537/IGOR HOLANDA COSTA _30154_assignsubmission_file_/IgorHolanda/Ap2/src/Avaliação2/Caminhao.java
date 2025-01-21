package Avaliação2;

public class Caminhao implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("O caminhão esta acelerando");
	}

	@Override
	public void frear() {
		System.out.println("O caminhão esta freando");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O caminhão esta fazendoi barulho");
	}
	

}
