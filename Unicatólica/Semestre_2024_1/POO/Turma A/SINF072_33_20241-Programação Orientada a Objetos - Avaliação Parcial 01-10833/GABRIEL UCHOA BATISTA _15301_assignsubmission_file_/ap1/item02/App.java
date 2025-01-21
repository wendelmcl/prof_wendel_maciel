package item02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° numero inteiro: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        sc.close();

        System.out.println("Soma total: " + soma);

    }
}
