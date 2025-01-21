package respostas.quest4;

import java.util.Scanner;
public class Cadastro { public static void main(String[] args) {
    Cadastro cadastro = new Cadastro();

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Consultar cliente");
        System.out.println("3 - Exibir clientes");
        System.out.println("4 - Sair");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.nextLine();
                scanner.nextLine();

                System.out.print("Digite a idade do cliente: ");
                int idade = scanner.nextInt();

                System.out.print("Digite o email do cliente: ");
                String email = scanner.nextLine();

                Cadastro.cadastrarCliente(new Cliente(nome, idade, email));
                break;
            case 2:
                System.out.print("Digite o nome do cliente: ");
                nome = scanner.nextLine();

                Cliente cliente = cadastro.consultarCliente(nome);

                if (cliente!= null) {
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("Idade: " + cliente.getIdade());
                    System.out.println("Email: " + cliente.getEmail());
                } else {
                    System.out.println("Cliente não encontrado.");
                }
                break;
            case 3:
                cadastro.exibirClientes();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
        }
    }
}

private void exibirClientes() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'exibirClientes'");
}

private Cliente consultarCliente(String nome) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'consultarCliente'");
}

private static void cadastrarCliente(Cliente cliente) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'cadastrarCliente'");
}
}
