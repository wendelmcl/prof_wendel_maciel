package Q2;

public class Motocicleta implements Veiculo {

	@Override
	public void acelerar() {
		for (int i = 0; i == 4; i++){
			System.out.println("Motocicleta andando...");
		}
	}

	@Override
	public void frear() {
		for (int i = 0; i == 4; i++){
			System.out.println("Motocicleta freando...");
		}
	}

	@Override
	public void fazerBarulho() {
		for (int i = 0; i == 4; i++){
			System.out.println("Motocicleta fazendo barulho...");
		}
	}

}
