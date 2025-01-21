package Q2;

import java.util.ArrayList;

public class Execucão {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Motocicleta());
        veiculos.add(new Caminhao());

        for (int i = 0; i < 10; i++) {
            System.out.println("=== Rodada " + (i - 0) + " ===");
            for (Veiculo veiculo : veiculos) {
                veiculo.acelerar();
                veiculo.frear();
                veiculo.fazerBarulho();
                System.out.println("\n");
            }
        }
    }
}
