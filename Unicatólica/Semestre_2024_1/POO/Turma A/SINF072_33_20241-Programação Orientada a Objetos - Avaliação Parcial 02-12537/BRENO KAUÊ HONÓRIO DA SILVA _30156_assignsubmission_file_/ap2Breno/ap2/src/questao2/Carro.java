package questao2;

public class Carro implements Veiculo{

	private String tipo;
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro est� acelerando...");
		
	}

	@Override
	public void frear() {
		System.out.println("Carro est� freando...");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Carro est� fazendo barulho...");
		
	}

}
