package questao2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Carro> carros = new ArrayList<Carro>();
		Carro c1 = new Carro();
		c1.setTipo("Ferrari");
		carros.add(c1);
		for(int i = 0; i < carros.size(); i++ ){
			c1.acelerar();
			c1.frear();
			c1.fazerBarulho();
		}
			
		List<Motocicleta> motos = new ArrayList<Motocicleta>();
		Motocicleta m1 = new Motocicleta();
		m1.setMarca("Honda");
		motos.add(m1);
		
		for(int i = 0; i < motos.size(); i++ ){
			m1.acelerar();
			m1.frear();
			m1.fazerBarulho();
			
		}
		
		List<Caminhao> caminhoes = new ArrayList<Caminhao>();
		Caminhao t1 = new Caminhao();
		t1.setModelo("Bitrem");
		caminhoes.add(t1);
		for(int i = 0; i < caminhoes.size(); i++ ){
			t1.acelerar();
			t1.frear();
			t1.fazerBarulho();
		}	
		sc.close();

	}

}
