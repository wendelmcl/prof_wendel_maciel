package questão4;

import java.util.Scanner;

public class execução {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente c = new Cliente();

        System.out.println("Deseja cadastrar um novo cliente?");
        int escreva = sc.nextInt();
        if (escreva == 1) {
            System.out.println("Qual o nome do usuario?");
            c.setNome(sc.next());
            System.out.println("Qual a sua idade?");
            c.setIdade(sc.nextInt());
            System.out.println("Qual o seu email?");
            c.setEmail(sc.next());
        } else if (escreva == 2) {
            System.out.println("Deseja consultar cliente já cadastrado? 1 sim, 2 não");
            if (escreva == 1) {
                System.out.println("Qual o nome do cliente?");
                c.setNome(sc.next());
            } else {
                System.out.println("Obrigado pela preferencia!");
            }
        } else {
            System.out.println("Ação invalida!");
        }

        sc.close();
    }

}
