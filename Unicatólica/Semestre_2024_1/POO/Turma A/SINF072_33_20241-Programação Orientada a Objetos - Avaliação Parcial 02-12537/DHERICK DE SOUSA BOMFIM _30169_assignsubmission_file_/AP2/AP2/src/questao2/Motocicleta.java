package questao2;

public class Motocicleta implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("A moto est� acelerando...");
	}

	@Override
	public void frear() {
		System.out.println("A moto est� freiando...");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Ranrandandannn!");
	}

}
