package Q2;

public class moto implements Veiculo {
	
	private String modelo;
	
	
	public moto(String modelo) {
		super();
		this.modelo = modelo;
	}

	@Override
	public void frear() {
			System.out.println("A moto esta freando");
	}

	@Override
	public void acelerar() {
			System.out.println("A moto esta acelerando");

	}

	@Override
	public void fazerBarulho() {
			System.out.println("A moto esta fazendo barulho");
	}
}
