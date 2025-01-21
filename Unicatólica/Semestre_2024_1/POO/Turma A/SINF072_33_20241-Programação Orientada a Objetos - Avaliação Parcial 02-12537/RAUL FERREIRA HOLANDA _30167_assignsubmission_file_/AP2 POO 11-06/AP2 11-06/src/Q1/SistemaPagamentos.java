package Q1;

import java.util.ArrayList;
import java.util.Scanner;


public class SistemaPagamentos {
    public static void main(String[] args) {
        
    	ArrayList<FormaPagamento> formasPagamento = new ArrayList<>();
        formasPagamento.add(new CartaoCredito(100.0, "1234-5678-9012-3456", "123"));
        formasPagamento.add(new CartaoDebito(50.0, "9876-5432-1098-7654"));
        formasPagamento.add(new Boleto(200.0, "1234567890123456789012345678901234567890"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a forma de pagamento: \n (1 - Cartão de Crédito, 2 - Cartão de Débito, 3 - Boleto) ");
        int opcao = sc.nextInt();

        if (opcao >= 1 && opcao <= formasPagamento.size()) {
            FormaPagamento formaEscolhida = formasPagamento.get(opcao - 1);
            System.out.println("Processando pagamento...");
            System.out.println(formaEscolhida.gerarRecibo());
        } else {
            System.out.println("Opção inválida.");
        }
    }
}














