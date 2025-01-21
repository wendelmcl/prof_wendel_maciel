package Avaliação2;

public class Motocicleta implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("A motocicleta esta acelerando");
	}

	@Override
	public void frear() {
		System.out.println("A motocicleta esta freando");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("A motocicleta esta fazendo barulho");
	}

}
