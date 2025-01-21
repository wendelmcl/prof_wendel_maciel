package Avaliação2;

import java.util.ArrayList;

public class Crud  {
	
	ArrayList<Veiculo> corrida = new ArrayList<>();
	
	public void loop(Carro c){
		for(int i = 0; i < 4; i++){
			c.acelerar();
			c.frear();
			c.fazerBarulho();
		}
	}
	
	public void loop2(Motocicleta m){
		for(int i = 0; i < 4; i++){
			m.acelerar();
			m.frear();
			m.fazerBarulho();
		}
		
	}
	
	public void loop3(Caminhao ca){
		for(int i = 0; i < 4; i++){
			ca.acelerar();
			ca.frear();
			ca.fazerBarulho();
		}
	}
	
	

}
