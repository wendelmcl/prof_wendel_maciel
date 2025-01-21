package q2;

public class Carro implements Veiculo  {
	private String cor;
	
	public Carro(String cor){
		this.cor = cor;
	}
	

	@Override
	public void acelerar() {
		System.out.println("O carro "+ getCor() +" est� acelerando.");
		
	}

	@Override
	public void frear() {
		System.out.println("O carro "+ getCor() +" est� freando.");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O carro "+ getCor() +"est� fazendo barulho");
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
