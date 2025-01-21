package q2;

import java.util.ArrayList;

public class Array {
	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public void Carro(){
		for(int i = 0; i < veiculos.size(); i++){
			System.out.println("Acelerando carro");
		}
	}
	
	public void Motocicleta(){
		for(int i = 0; i < veiculos.size(); i++){
			Motocicleta m1 = new Motocicleta();
			m1.acelerar();
		}
	}
	
	public void Caminhao(){
		for(int i = 0; i < veiculos.size(); i++){
			Caminhao ca1 = new Caminhao();
			ca1.acelerar();
		}
	}
}