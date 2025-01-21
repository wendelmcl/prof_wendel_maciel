package questao2;

public class Caminhao implements Veiculo{

	private String modelo;
	
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void acelerar() {
		System.out.println("Caminhão está acelerando...");
		
	}

	@Override
	public void frear() {
		System.out.println("Caminhão está freando...");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Caminhão está fazendo barulho...");
		
	}

}
