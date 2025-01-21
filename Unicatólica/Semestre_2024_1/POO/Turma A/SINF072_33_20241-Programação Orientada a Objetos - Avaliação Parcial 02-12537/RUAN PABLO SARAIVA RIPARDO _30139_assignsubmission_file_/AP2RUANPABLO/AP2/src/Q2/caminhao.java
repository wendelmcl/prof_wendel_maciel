package Q2;

public class caminhao implements Veiculo {
	
	private String modelo;
	
	
	public caminhao(String modelo) {
		super();
		this.modelo = modelo;
	}

	@Override
	public void frear() {
			System.out.println("O caminhao esta freando");
	}

	@Override
	public void acelerar() {	
		System.out.println("O caminhao esta acelerando");
	}

	@Override
	public void fazerBarulho() {
	
			System.out.println("O caminhao esta fazendo barulho");
		
	}

	

}
