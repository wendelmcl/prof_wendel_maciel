package q2;

public class Caminhao implements Veiculo {
	private String cor;
	
	public Caminhao(String cor){
		this.cor = cor;
	}
	

	@Override
	public void acelerar() {
		System.out.println("O caminhão "+ getCor()+" está acelerando.");
		
	}

	@Override
	public void frear() {
		System.out.println("O caminhão "+ getCor()+" está freando.");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O caminhão "+ getCor()+" está buzinando.");
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
