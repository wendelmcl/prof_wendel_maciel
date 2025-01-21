package Q4;

import java.util.Scanner;

public class Execucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Seja bem-vindo ao seu novo cadastro");

        System.out.println("DIgite seu nome completo: ");
        pessoa1.setNome((sc.next()));
        System.out.println("DIgite sua idade: ");
        pessoa1.setIdade((sc.nextInt()));
        System.out.println("DIgite seu Email: ");
        pessoa1.setEmail((sc.next()));

        System.out.println("Cliente cadastrado com sucesso ");
        System.out.println();pessoa1.getNome();
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEmail());

        Pessoa pessoa2 = new Pessoa();

        pessoa2.setNome(null);
        pessoa2.setIdade(0);
        pessoa2.setEmail(null);
        System.out.println("Nome: Gabriel Braga " + pessoa2.getNome());
        System.out.println("Idade: 20" + pessoa2.getIdade());
        System.out.println("Email: WendelLindo@gmail.com");

        sc.close();
    }
}
