package Questao01.SistemaDePagamentos.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um método de pagamento: 1 - Boleto, \2 - Credito,  3 - Debito, 4 - Dinheiro ");
        int Metodo = leitor.nextInt();

        ArrayList a1 = new ArrayList<Integer>();

        while (Metodo != 0) {
            if (Metodo == 1) {
                Boleto b1 = new Boleto();
                System.out.println("Quanto irá pagar? ");
                b1.setValor(leitor.nextDouble());

                System.out.println("Insira o vencimento do boleto: ");
                b1.setDataVencimento(leitor.nextInt());
                b1.GerarRecibo();
                a1.add(1);

                System.out
                        .println("Insira um método de pagamento: 1 - Boleto, \2 - Credito,  3 - Debito, 4 - Dinheiro ");
                System.out.println("Ou zero para sair");
                Metodo = leitor.nextInt();

            }
            if (Metodo == 2) {
                CartaoCredito c1 = new CartaoCredito();
                System.out.println("Insira o código de Seguraça");
                c1.setCodigoSegurançA(leitor.nextInt());
                System.out.println("Insira Data de Vencimento");
                c1.setDataVencimento(leitor.nextInt());
                System.out.println("Insira Numero Cartao");
                c1.setNumeroCartao(leitor.nextInt());
                System.out.println("Quanto irá pagar? ");
                c1.setValor(leitor.nextDouble());
                a1.add(2);
                System.out
                        .println("Insira um método de pagamento: 1 - Boleto, \2 - Credito,  3 - Debito, 4 - Dinheiro ");
                System.out.println("Ou zero para sair");
                Metodo = leitor.nextInt();
                c1.GerarRecibo();

            }
            if (Metodo == 3) {
                CartaoDebito db1 = new CartaoDebito();
                System.out.println("Insira o código de Seguraça");
                db1.setCodigoSegurançA(leitor.nextInt());

                System.out.println("Insira Data de Vencimento");
                db1.setDataVencimento(leitor.nextInt());

                System.out.println("Insira Numero Cartao");
                db1.setNumeroCartao(leitor.nextInt());
                System.out.println("Quanto irá pagar? ");
                db1.setValor(leitor.nextDouble());
                System.out
                        .println("Insira um método de pagamento: 1 - Boleto, \2 - Credito,  3 - Debito, 4 - Dinheiro ");
                System.out.println("Ou zero para sair");
                Metodo = leitor.nextInt();
                db1.GerarRecibo();
                a1.add(3);

            }
            if (Metodo == 4) {
                Dinheiro d1 = new Dinheiro();

                System.out.println("Quanto irá pagar? ");
                d1.setValor(leitor.nextDouble());
                d1.GerarRecibo();
                a1.add(4);

                System.out
                        .println("Insira um método de pagamento: 1 - Boleto, \2 - Credito,  3 - Debito, 4 - Dinheiro ");
                System.out.println("Ou zero para sair");
                Metodo = leitor.nextInt();

            }
        }
        int i = a1.size();
        int rodar = 0;
        while (i != 0) {

            if (((a1.get(rodar)).toString()).equals("1")) {
                System.out.println("Pagamento via boleto");
            }
            if (((a1.get(rodar)).toString()).equals("2")) {
                System.out.println("Pagamento via Credito");
            }
            if (((a1.get(rodar)).toString()).equals("3")) {
                System.out.println("Pagamento via Debito");
            }
            if (((a1.get(rodar)).toString()).equals("4")) {
                System.out.println("Pagamento via Dinheiro");
            }
            i -= 1;
            rodar += 1;

        }
        leitor.close();

    }
}
