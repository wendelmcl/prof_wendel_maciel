package classes_abstratas_e_interface;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Veiculo v1 = new Carro("XZZ-1020", "Fusca", 1970, 5000);
		Veiculo v2 = new Moto("ZZX-2010", "Titan", 2010, 3000);
		List<Veiculo> listaVeiculos = new ArrayList<>();
		listaVeiculos.add(v1);
		listaVeiculos.add(v2);
		
		for(Veiculo v : listaVeiculos) {
			v.exibirDados();
			System.out.println("Imposto: "+v.calcularImposto());
			System.out.println(v.getTipoTributacao());
			System.out.println("\n");
		}
	}
}
