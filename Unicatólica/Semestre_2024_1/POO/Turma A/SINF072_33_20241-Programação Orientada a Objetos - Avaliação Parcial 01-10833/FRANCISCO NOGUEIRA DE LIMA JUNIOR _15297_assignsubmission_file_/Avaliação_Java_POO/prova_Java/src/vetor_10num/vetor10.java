package vetor_10num;

import java.util.Scanner;

public class vetor10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int pares = 0;
        int impares = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}

