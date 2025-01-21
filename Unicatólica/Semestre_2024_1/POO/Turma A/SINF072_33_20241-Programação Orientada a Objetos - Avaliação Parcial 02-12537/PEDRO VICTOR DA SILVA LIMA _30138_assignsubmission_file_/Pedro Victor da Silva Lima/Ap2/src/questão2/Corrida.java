package questão2;

import java.util.ArrayList;

public  class Corrida {
    public static void main(String[] args) {
        ArrayList<Veiculo> corrida = new ArrayList<>();

        corrida.add(new Carro());
        corrida.add(new Motocicleta());
        corrida.add(new Caminhao());

        for (Veiculo veiculo : corrida) {
            veiculo.acelerar();
            veiculo.fazerBarulho();
            veiculo.frear();
            System.out.println(); 
        }
    }}
