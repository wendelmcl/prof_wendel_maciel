package questao2;

public class Main {
	
	public static void main(String[] args) {
		
		Motocicleta m1 = new Motocicleta();
		Carro c1 = new Carro();
		Caminhao c2 = new Caminhao();
		
		
		for(int i = 0; i < 3; i++){
			while (i < 3){ m1.acelerar();
			m1.frear();
			m1.fazerBarulho();
			c1.acelerar();
			c1.frear();
			c1.fazerBarulho();
			c2.acelerar();
			c2.frear();
			c2.fazerBarulho();
				
			}
			
		}
		
	}
	

}
