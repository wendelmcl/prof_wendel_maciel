package questao2;

public class Motocicleta implements Veiculo{
	
	int velocidade;
	String cor;
	String modelo;
	@Override
	public void acelerar() {
		velocidade += 0.6;
	}
	@Override
	public void frear() {
		velocidade -= 0.4;
		
	}
	@Override
	public void fazerBarulho() {
		System.out.println("vruuuuuum");
		
	}
	
	
	

}
