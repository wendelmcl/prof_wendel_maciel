package q2;

public class Caminhao implements Veiculo {
	private String modelo, cor;
	
	@Override
	public void acelerar() {
		System.out.println("O Caminhão " + this.modelo + " de cor: " + this.cor + " está acelerando");
	}

	@Override
	public void frear() {
		System.out.println("O Caminhão " + this.modelo + " de cor: " + this.cor + " está freando");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O Caminhão " + this.modelo + " de cor: " + this.cor + " está fazendo barulho");
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
