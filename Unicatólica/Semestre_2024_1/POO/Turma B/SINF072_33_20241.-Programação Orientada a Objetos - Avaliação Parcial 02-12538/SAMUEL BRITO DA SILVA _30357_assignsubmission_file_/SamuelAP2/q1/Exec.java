package q1;

import java.util.Scanner;

public class Exec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geladeira Geladeira = new Geladeira();
        TV TV = new TV();

        System.out.println("Qual o tipo do Produto que você deseja consultar?");
        System.out.println("Tipo - 1: Geladeira");
        System.out.println("Tipo - 2: TV");
        int Tipo = sc.nextInt();

        if (Tipo == 1) {
            Geladeira.imprimirInformacoes();
            Geladeira.calcularGarantiaEstendida();
        } else if (Tipo == 2) {
            TV.imprimirInformacoes();
            TV.calcularGarantiaEstendida();
        }

        sc.close();
        
    }
}
