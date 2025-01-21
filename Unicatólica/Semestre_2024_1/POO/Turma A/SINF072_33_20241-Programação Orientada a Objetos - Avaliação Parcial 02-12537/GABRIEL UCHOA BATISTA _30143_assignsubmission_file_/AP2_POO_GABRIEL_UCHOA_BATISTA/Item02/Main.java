package Item02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> corrida = new ArrayList<Veiculo>();

        Carro carro = new Carro(10);
        Motocicleta motocicleta = new Motocicleta(20);
        Caminhao caminhao = new Caminhao(30);

        corrida.add(carro);
        corrida.add(motocicleta);
        corrida.add(caminhao);

        for (int i = 0; i < 10; i++) {
            carro.acelerar();
            motocicleta.fazerBarulho();
            caminhao.frear();
            carro.frear();
            motocicleta.acelerar();
            caminhao.fazerBarulho();
            carro.fazerBarulho();
            motocicleta.frear();
            caminhao.acelerar();
        }

    }
}