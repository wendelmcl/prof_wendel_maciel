package questão3;

import java.util.Scanner;

public class vetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[5];

        System.out.println("Digite o primeiro numero.");
        vetor[0] = sc.nextInt();
        System.out.println("Digite o segundo número.");
        vetor[1] = sc.nextInt();
        System.out.println("Digite o terceiro numero.");
        vetor[2] = sc.nextInt();
        System.out.println("Digite o quarto numero.");
        vetor[3] = sc.nextInt();
        System.out.println("Digite o quinto numero.");
        vetor[4] = sc.nextInt();

        for (int i = 0; i <= vetor.length; i++) {
            System.out.println("O resultado é: ");
            System.out.println(vetor[0]);
            System.out.println(vetor[1]);
            System.out.println(vetor[2]);
            System.out.println(vetor[3]);
            System.out.println(vetor[4]);

        }

        sc.close();

    }

}
