package Q4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/* Desenvolva um sistema de cadastro de clientes em Java ultilizando POO. Crie uma classe Cliente com os atributos nome (String), idade (int) e email (String). Implemente métodos para definir e obter o valor dos atributos, seguindo o conceito de encapsulamento. Em seguida, crie um programa em Java que permita ao usuário cadastrar novos clientes, consultar os dados de um cliente especifico e exibir a lista de clientes cadastrados. */

public class Execucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        System.out.println("Bem vindo ao sistema de cadastro de clientes");
        int opcao = 0;
        do {
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Consultar cliente");
            System.out.println("3 - Listar clientes");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: 
                System.out.println("Digite o nome do cliente: ");
                String nome = sc.next();
                System.out.println("Digite a idade do cliente: ");
                int idade = sc.nextInt();
                System.out.println("Digite o email do cliente: ");
                String email = sc.next();
                Cliente cliente = new Cliente(nome, idade, email);
                clientes.add(cliente);
                System.out.println("---------------------------------");
                System.out.println("Cliente cadastrado com sucesso!");
                System.out.println("---------------------------------");
                break;
                case 2:
                System.out.println("Digite o nome do cliente: ");
                String nomeCliente = sc.next();
                for (Cliente cliente1 : clientes) {
                    if (cliente1.getNome().equals(nomeCliente)) {
                        System.out.println("---------------------------------");
                        System.out.println("Nome: " + cliente1.getNome());
                        System.out.println("Idade: " + cliente1.getIdade());
                        System.out.println("Email: " + cliente1.getEmail());
                        System.out.println("---------------------------------");
                    } else {
                        System.out.println("---------------------------------");
                        System.out.println("Cliente não encontrado!");
                        System.out.println("---------------------------------");
                    }
                }
                break;
                case 3:
                System.out.println("Lista de clientes: ");
                System.out.println("---------------------------------");
                for (int i = 0; i < clientes.size(); i++) {
                    System.out.println("Nome: " + clientes.get(i).getNome());
                    System.out.println("Nome: " + clientes.get(i).getIdade());
                    System.out.println("Nome: " + clientes.get(i).getEmail());
                    System.out.println("---------------------------------");
                }
                break;
                case 0:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opção inválida!");
                break;
            }
            
        } while (opcao != 0);
    }
}
