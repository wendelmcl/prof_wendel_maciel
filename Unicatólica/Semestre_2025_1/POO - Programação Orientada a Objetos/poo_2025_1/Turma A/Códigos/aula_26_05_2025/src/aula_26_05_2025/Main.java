package aula_26_05_2025;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Veiculo c1 = new Carro("WXA-3344", "Hilux", 2020, 50000);
		Veiculo m1 = new Moto("WAZ-4455", "Titan", 2025, 10000);
	
		List<Veiculo> listaVeiculos = new ArrayList<>();
		listaVeiculos.add(c1);
		listaVeiculos.add(m1);
		
		for(Veiculo v : listaVeiculos) {
			v.exibirDados();
			System.out.println("Valor do imposto: "+ v.calcularImposto());			
		}
	}
}
