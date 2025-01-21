package Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Veiculo> veiculo = new ArrayList();
		
		veiculo.add(new caminhao("Scania"));
		veiculo.add(new moto("Honda"));
		veiculo.add(new Carro("Hb20"));
		
		for(int i = 0; i<=9; i++) {
			if(i % 2 == 0) {
				veiculo.get(0).acelerar();
				veiculo.get(1).frear();
				veiculo.get(2).fazerBarulho();
				veiculo.get(0).frear();
				veiculo.get(1).fazerBarulho();
			}
			else {
				veiculo.get(1).acelerar();
				veiculo.get(2).frear();
				veiculo.get(0).fazerBarulho();
				veiculo.get(1).frear();
				veiculo.get(2).fazerBarulho();
			}
		}
	}

}
