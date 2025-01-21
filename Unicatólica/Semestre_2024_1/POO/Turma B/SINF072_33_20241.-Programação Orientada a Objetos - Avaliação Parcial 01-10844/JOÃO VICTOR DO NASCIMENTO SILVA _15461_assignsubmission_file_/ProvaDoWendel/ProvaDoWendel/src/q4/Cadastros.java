package q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastros {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar novo cliente");
            System.out.println("2 - Consultar cliente");
            System.out.println("3 - Sair");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String nome = input.next();
                    System.out.println("Digite a idade do cliente:");
                    int idade = input.nextInt();
                    System.out.println("Digite o email do cliente:");
                    String email = input.next();
                    clientes.add(new Cliente(nome, idade, email));
                    break;
                case 2:
                    System.out.println("Digite o nome do cliente que deseja consultar:");
                    String nomeConsulta = input.next();
                    boolean encontrado = false;
                    for (Cliente cliente : clientes) {
                        if (cliente.getNome().equals(nomeConsulta)) {
                            System.out.println("Cliente encontrado:");
                            System.out.println("Nome: " + cliente.getNome());
                            System.out.println("Idade: " + cliente.getIdade());
                            System.out.println("Email: " + cliente.getEmail());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}