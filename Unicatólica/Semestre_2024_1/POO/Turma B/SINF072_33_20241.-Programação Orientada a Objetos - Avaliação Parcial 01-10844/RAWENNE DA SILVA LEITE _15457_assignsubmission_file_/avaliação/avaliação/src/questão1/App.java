package questão1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        int soma = num / num + 5;

        System.out.println(soma);
        sc.close();

    }
}
