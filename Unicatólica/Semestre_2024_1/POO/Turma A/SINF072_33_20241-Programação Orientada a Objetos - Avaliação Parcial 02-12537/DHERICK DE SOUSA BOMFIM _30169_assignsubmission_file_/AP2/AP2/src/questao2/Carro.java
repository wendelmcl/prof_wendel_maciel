package questao2;

public class Carro implements Veiculo {

	@Override
	public void acelerar() {
		System.out.print("O carro está acelerando...");
	}

	@Override
	public void frear() {
		System.out.print("O carro está freiando...");
	}

	@Override
	public void fazerBarulho() {
		System.out.print("vrum vrum...");
	}

}
