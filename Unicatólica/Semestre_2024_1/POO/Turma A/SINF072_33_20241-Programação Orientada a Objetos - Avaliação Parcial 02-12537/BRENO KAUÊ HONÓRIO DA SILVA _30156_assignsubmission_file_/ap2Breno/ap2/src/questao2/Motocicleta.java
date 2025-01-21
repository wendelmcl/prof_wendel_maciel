package questao2;

public class Motocicleta implements Veiculo{

	private String marca;
	
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void acelerar() {
		System.out.println("Motocicleta está acelerando...");
		
	}

	
	public void frear() {
		System.out.println("Motocicleta está freando...");
		
	}

	public void fazerBarulho() {
		System.out.println("Motocicleta está fazendo barulho...");
		
	}

}