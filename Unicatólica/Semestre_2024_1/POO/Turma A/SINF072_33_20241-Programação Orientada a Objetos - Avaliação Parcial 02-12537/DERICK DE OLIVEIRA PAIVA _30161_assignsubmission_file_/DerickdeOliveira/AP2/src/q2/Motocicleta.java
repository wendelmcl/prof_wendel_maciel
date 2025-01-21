package q2;

public class Motocicleta implements Veiculo {
	private String cor;
	
	public Motocicleta(String cor){
		this.cor = cor;
	}

	

	@Override
	public void acelerar() {
		System.out.println("A motocicleta "+ getCor() +" est� acelerando.");
		
	}

	@Override
	public void frear() {
		System.out.println("A motocicleta "+ getCor() +" est� freando.");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("A motocicleta "+ getCor() +" est� buzinando.");
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}

