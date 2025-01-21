package questao2;

public class Caminhao implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("O caminhão está acelerando...");
	}

	@Override
	public void frear() {
		System.out.println("O caminhão está freiando...");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("FonFonnn(buzina)");
	}

}
