import java.util.ArrayList;


public class Main {

	public static void main(String[] args){
		
		Carro carro = new Carro();
		Motocicleta motocicleta = new Motocicleta();
		Caminhao caminhao = new Caminhao();
		
		
		ArrayList<Veiculo> Corrida = new ArrayList();
		Corrida.add(carro);
		Corrida.add(motocicleta);
		Corrida.add(caminhao);
	
	for (Veiculo veiculo : Corrida){
		veiculo.acelerar();
		veiculo.frear();
		veiculo.fazerBaraulho();
	}
}
}
