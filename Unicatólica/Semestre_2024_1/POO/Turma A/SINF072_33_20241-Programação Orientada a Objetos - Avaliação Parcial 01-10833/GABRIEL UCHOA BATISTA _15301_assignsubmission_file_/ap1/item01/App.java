package item01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro positivo: ");
        num = sc.nextInt();
        sc.close();

        if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println("O número digitado é primo!");
        } else if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0)) {
            System.out.println("O número digitado não é primo!");
        } else {
            System.out.println("O número digitado é primo!");
        }

    }
}
