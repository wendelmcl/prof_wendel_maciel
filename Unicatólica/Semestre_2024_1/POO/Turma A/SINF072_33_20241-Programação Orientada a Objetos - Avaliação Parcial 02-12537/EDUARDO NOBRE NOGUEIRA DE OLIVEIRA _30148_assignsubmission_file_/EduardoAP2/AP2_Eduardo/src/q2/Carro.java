package q2;

public class Carro implements Veiculo{
	private String modelo, cor;
	@Override
	public void acelerar() {
		System.out.println("O Carro " + this.modelo + " de cor: " + this.cor + " est� acelerando");
	}

	@Override
	public void frear() {
		System.out.println("O Carro " + this.modelo + " de cor: " + this.cor + " est� freando");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O Carro " + this.modelo + " de cor: " + this.cor + " est� fazendo barulho");
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
