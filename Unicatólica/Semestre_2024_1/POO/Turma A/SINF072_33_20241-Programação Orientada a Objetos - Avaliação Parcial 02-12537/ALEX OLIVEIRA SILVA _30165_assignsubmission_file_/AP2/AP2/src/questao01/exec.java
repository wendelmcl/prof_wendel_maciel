package questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class exec {
    public static void main(String[] args) {
        ArrayList<FormaPagamento> formasPagamento = new ArrayList<>();

        formasPagamento.add(new CartaoCredito("1245 6578", "12/25", "Alex", "823", 30.0));
        formasPagamento.add(new CartaoDebito("1246 6549", "Maria", "745", 50.0));
        formasPagamento.add(new Boleto("12854867698", 70.0));
        formasPagamento.add(new Dinheiro(100.0));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. Cartão de Débito");
        System.out.println("3. Boleto");
        System.out.println("4. Dinheiro");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= 4) {
            FormaPagamento formaEscolhida = formasPagamento.get(escolha - 1);
            formaEscolhida.efetuarPagamento();
            System.out.println("Recibo gerado para pagamento de " + formaEscolhida.valor + " reais via " + formaEscolhida.tipo + ".");
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}

