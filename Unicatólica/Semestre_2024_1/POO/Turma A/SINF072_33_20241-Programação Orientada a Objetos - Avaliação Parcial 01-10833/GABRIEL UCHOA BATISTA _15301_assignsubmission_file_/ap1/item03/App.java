package item03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int pares = 0;
        int impares = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° numero inteiro: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        sc.close();
        System.out.println("\nQtd. de Números pares: " + pares);
        System.out.println("Qtd. de Números impares: " + impares);

    }
}
