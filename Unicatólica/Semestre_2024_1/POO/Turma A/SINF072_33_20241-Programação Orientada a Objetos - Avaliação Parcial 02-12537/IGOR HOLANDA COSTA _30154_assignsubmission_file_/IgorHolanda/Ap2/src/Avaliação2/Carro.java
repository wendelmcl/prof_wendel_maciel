package Avaliação2;

public class Carro implements Veiculo{

	@Override
	public void acelerar() {
		System.out.println("O carro esta acelerando");
		
	}

	@Override
	public void frear() {
		System.out.println("O carro esta freando");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O carro esta fazendo barulho");
		
	}

}
