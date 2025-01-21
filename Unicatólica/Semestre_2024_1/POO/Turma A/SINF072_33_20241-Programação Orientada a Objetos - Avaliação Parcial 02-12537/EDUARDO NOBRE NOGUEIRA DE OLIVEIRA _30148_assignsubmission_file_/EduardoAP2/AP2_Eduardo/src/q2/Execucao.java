package q2;

import java.util.ArrayList;

public class Execucao {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setCor("Azul");
		c1.setModelo("Celta");
		
		Motocicleta m1 = new Motocicleta();
		m1.setCor("Preta");
		m1.setModelo("Bross");
		
		Caminhao cm1 = new Caminhao();
		cm1.setCor("Branco");
		cm1.setModelo("F1000");
		
		Carro c2 = new Carro();
		c2.setCor("Preto");
		c2.setModelo("Opala");
		
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(c1);
		veiculos.add(m1);
		veiculos.add(cm1);
		veiculos.add(c2);
		
		for(int i = 0; i < veiculos.size(); i++){
			veiculos.get(i).acelerar();
			veiculos.get(i).frear();
			veiculos.get(i).fazerBarulho();
		}
		
	}

}
