package Ap2Q2;

import java.util.ArrayList;

public class Corrida {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Motocicleta());
        veiculos.add(new Caminhao());



        for (int i = 0; i < 5; i++) { 
            System.out.println("Rodada " + (i+1) + ":");

            for (Veiculo veiculo : veiculos) {
                veiculo.acelerar();
                veiculo.fazerBarulho();
                veiculo.frear();
                System.out.println(); 
            }

            System.out.println();
        }
    }
}