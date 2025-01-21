

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("tente outra opcao:");
            System.out.println("1. registar cliente");
            System.out.println("2. Consulta cliente");
            System.out.println("3. lista do cliente");
            System.out.println("4. sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    registerNewClient();
                    break;
                case 2:
                    consultClientData();
                    break;
                case 3:
                    displayClients();
                    break;
                case 4:
                    System.out.println("tchal!");
                    break;
                default:
                    System.out.println("opcao invalida.");
            }
        } while (option!= 4);
    }

    private static void registerNewClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome :");
        String nome = scanner.nextLine();
        System.out.println("digite idade:");
        int idade = scanner.nextInt();
        System.out.println("digite email:");
        String email = scanner.next();

        cliente cliente = new cliente(nome, idade, email);
        clientes.add(cliente);

        System.out.println("cliente registrado com sucesso !");
    }

    private static void consultClientData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome do cliente:");
        String nome = scanner.nextLine();

        for (cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Client data:");
                System.out.println("nome: " + cliente.getNome());
                System.out.println("idade: " + cliente.getIdade());
                System.out.println("Email: " + cliente.getEmail());
                return;
            }
        }

        System.out.println("cliente nao cadastrado.");
    }

    private static void displayClients() {
        System.out.println("Lista de clientes :");
        for (cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
        }
    }
}