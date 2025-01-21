package Questao02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        Motocicleta m1 = new Motocicleta();
        Caminhao cm1 = new Caminhao();
        ArrayList a1 = new ArrayList<Veiculo>();

        for (int i = 0; i <= 0; i++) {
            c1.Acelerar();
            m1.Acelerar();
            cm1.Acelerar();
            System.out.println("Nova ação! -------------------\n");
            c1.Frear();
            m1.Frear();
            cm1.Frear();
            System.out.println("Nova ação! -------------------\n");
            c1.FazerBarulho();
            m1.FazerBarulho();
            cm1.FazerBarulho();
        }

    }
}
