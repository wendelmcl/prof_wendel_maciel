package veiculo;

import java.util.ArrayList;

public class Corrida {

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculosCorrida = new ArrayList<>();
        veiculosCorrida.add(new Carro());
        veiculosCorrida.add(new Moto());
        veiculosCorrida.add(new Caminhao());

        for (int i = 0; i < 5; i++) {
            System.out.println("### Rodada " + (i + 1) + " ###");
            for (Veiculo veiculo : veiculosCorrida) {
                veiculo.acelerar();
                veiculo.fazerBarulho();
                veiculo.frear();
            }
            System.out.println("----------------");
        }

	}

}
