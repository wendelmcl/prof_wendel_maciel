package Q2;

public class Carro implements Veiculo {
	
	private String modelo;
	
	
	public Carro(String modelo) {
		super();
		this.modelo = modelo;
	}

	@Override
	public void frear() {
	
			System.out.println("O carro esta freando");
		
	}

	@Override
	public void acelerar() {
		
	
			System.out.println("O carro esta acelerando");
	}

	@Override
	public void fazerBarulho() {
	
			System.out.println("O carro esta fazendo barulho");

	}

}
