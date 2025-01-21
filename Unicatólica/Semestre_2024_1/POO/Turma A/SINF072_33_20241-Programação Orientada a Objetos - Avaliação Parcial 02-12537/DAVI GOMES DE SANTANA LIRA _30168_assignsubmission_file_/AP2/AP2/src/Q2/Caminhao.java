package Q2;

public class Caminhao implements Veiculo {

	@Override
	public void acelerar() {
		for (int i = 0; i == 4; i++){
			System.out.println("Caminhao esta acelerando.");
		}
	}

	@Override
	public void frear() {
		for (int i = 0; i == 4; i++){
			System.out.println("Caminho esta freando.");
		}
	}

	@Override
	public void fazerBarulho() {
		for (int i = 0; i == 4; i++){
			System.out.println("Caminhao fazendo barulho");
		}
	}

}
