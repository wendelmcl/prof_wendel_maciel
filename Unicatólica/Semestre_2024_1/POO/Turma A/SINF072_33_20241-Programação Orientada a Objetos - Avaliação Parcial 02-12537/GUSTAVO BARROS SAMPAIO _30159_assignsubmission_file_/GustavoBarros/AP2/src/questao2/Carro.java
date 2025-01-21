package questao2;

import java.util.ArrayList;

public class Carro implements Veiculo{
	
	ArrayList<Veiculo> carros;
	
	double velocidade;
	String cor;
	String modelo;
	
	
	@Override
	public void acelerar() {
		velocidade += 0.4;
		
	}
	@Override
	public void frear() {
		velocidade -= 0.3;
		
	}
	@Override
	public void fazerBarulho() {
		System.out.println("VRUUMMMMM");
		
	}
	
	
	
	
	
	

}
