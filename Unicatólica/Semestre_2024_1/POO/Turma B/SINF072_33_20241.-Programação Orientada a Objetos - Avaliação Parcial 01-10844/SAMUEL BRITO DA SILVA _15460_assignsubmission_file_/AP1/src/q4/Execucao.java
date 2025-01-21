package q4;

import java.util.Scanner;

public class Execucao {
    public static void main(String[] args) {
        int escolha;
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Cadastrar novo cliente");
        System.out.println("2 - Consultar cliente");
        System.out.println("3 - Exibir lista de clientes"); 
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o nome do cliente: ");
                cliente.setNome(sc.nextLine());

                System.out.println("Digite a idade do cliente: ");
                cliente.setIdade(sc.nextInt());

                System.out.println("Digite o Email do cliente: ");
                cliente.setEmail(sc.nextLine());

                break;
            
            case 2:
                System.out.println("Digite o nome do Cliente: ");
                cliente.setNome(sc.nextLine());
                System.out.println("O cliente é: " + cliente.getNome()); 
                break;
            case 3:
                System.out.println("Lista de clientes já cadastrados: ");
                System.out.println("Cliente 01: " + cliente.getNome() + " " + cliente.getIdade() + " " + cliente.getEmail());
            default:
                break;
        }
        sc.close();
    }
}
