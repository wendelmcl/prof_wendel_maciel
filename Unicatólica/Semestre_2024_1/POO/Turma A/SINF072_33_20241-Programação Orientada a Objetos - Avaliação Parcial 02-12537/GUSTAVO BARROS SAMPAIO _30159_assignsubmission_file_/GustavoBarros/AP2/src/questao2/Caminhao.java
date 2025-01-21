package questao2;

public class Caminhao implements Veiculo {
	
	String cor;
	String modelo;
	int velocidade;
	@Override
	public void acelerar() {
		velocidade += 0.2;
		
	}
	@Override
	public void frear() {
		velocidade -= 0.1;
		
	}
	@Override
	public void fazerBarulho() {
		System.out.println("PIPIPI");
		
	}

}
