package questao2;

public class Caminhao implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("O caminh�o est� acelerando...");
	}

	@Override
	public void frear() {
		System.out.println("O caminh�o est� freiando...");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("FonFonnn(buzina)");
	}

}
