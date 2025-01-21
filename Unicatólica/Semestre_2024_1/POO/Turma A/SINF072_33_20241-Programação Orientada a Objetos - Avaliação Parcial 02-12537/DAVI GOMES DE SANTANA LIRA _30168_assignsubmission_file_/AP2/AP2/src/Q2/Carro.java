package Q2;

public class Carro implements Veiculo{

	@Override
	public void acelerar() {
		for (int i = 0; i == 4; i++){
			System.out.println("Carro acelerando...");
		}
	}

	@Override
	public void frear() {
		for (int i = 0; i == 4; i++){
			System.out.println("Carro freando...");
		}
	}

	@Override
	public void fazerBarulho() {
		for (int i = 0; i == 4; i++){
			System.out.println("Carro fazendo barulho...");
		}
	}

}
