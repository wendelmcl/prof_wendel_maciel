package Q2;

import java.awt.List;
import java.util.ArrayList;

public class Exe {
	ArrayList<Caminhao> caminhao = new ArrayList<Caminhao>();
	ArrayList<Carro> carro = new ArrayList<Carro>();
	ArrayList<Motocicleta> motocicleta = new ArrayList<Motocicleta>();
	
	public void metodoCaminhao(){
		Caminhao c1 = new Caminhao();
		c1.acelerar();
		c1.frear();
		c1.fazerBarulho();
	}
	
	public void metodoCarro(){
		Carro c2 = new Carro();
		c2.acelerar();
		c2.frear();
		c2.fazerBarulho();
	}
	
	public void metodoMotocicleta(){
		Motocicleta c3 = new Motocicleta();
		c3.acelerar();
		c3.frear();
		c3.fazerBarulho();
	}
}

