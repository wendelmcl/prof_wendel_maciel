package item04;

import java.util.Scanner;

import item04.banco.Conta;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Conta c1 = new Conta(123, "gabriel", 0.0);

        System.out.println("\nBem vindo ao Banco Unicatolica " + c1.getNome());
        do {
            System.out.println("\n1- Ver saldo | 2- Depositar | 3- Sacar | 4- Sair");
            System.out.print("Digite o número da opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    c1.verificarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor a ser adicionado a conta: ");
                    c1.realizarDeposito(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Digite o valor a ser retirado da conta: ");
                    c1.realizarSaque(sc.nextDouble());
                    break;
                default:
                    System.out.print("Logout realizado com sucesso, volte sempre!");
                    break;
            }

        } while (option != 4);
        sc.close();
    }
}
