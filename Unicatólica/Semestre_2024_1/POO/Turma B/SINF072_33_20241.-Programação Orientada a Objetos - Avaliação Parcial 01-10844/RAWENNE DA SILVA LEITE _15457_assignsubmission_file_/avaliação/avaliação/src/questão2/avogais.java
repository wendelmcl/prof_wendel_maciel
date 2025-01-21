package questão2;

import java.util.Scanner;

public class avogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vetor = { "a,e,i,o,u" };

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Escreva uma frase como quiser: ");
            vetor[i] = sc.nextLine();
            System.out.println(vetor[i]);

        }

        sc.close();

    }
}
