package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class CorridaExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Carro> carro = new ArrayList<Carro>(1);
		ArrayList<Motocicleta> moto = new ArrayList<Motocicleta>(1);
		ArrayList<Caminhao> truck = new ArrayList<Caminhao>(1);
		
		System.out.println("Digite os veículos da corrida : ");
		Carro c1 = new Carro();
		Motocicleta m1 = new Motocicleta();
		Caminhao t1 = new Caminhao();
		
		carro.add(c1);
		moto.add(m1);
		truck.add(t1);
		
		c1.fazerBarulho();
		m1.fazerBarulho();
		t1.fazerBarulho();
		
		for (int i = 0; i < 10; i++ ){
			System.out.println("Reta : ");
			c1.acelerar();
			m1.acelerar();
			t1.acelerar();
			System.out.println("Curva : ");
			c1.frear();
			m1.frear();
			t1.frear();
		}
		sc.close();
	}

}
