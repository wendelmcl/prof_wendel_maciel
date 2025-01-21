package Item01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<FormaPagamento> Pagamentos = new ArrayList<FormaPagamento>();
        int opt = 0;

        CartaoCredito credito = new CartaoCredito();
        CartaoDebito debito = new CartaoDebito();
        Boleto boleto = new Boleto();
        Dinheiro dinheiro = new Dinheiro();

        while (opt != 6){
            System.out.println("Escolha uma forma de pagamento:");
            System.out.println("1- Crédito | 2- Debito | 3- Boleto | 4- Dinheiro | 5- Recibo | 6- Sair");
            opt = sc.nextInt();
            if (opt == 1){
                credito.Cadastrar();
                Pagamentos.add(credito);
            }
            if (opt == 2){
                debito.Cadastrar();
                Pagamentos.add(debito);
            }
            if (opt == 3){
                boleto.Cadastrar();
                Pagamentos.add(boleto);
            }
            if (opt == 4){
                dinheiro.Cadastrar();
                Pagamentos.add(dinheiro);
            }

            if (opt == 5){
                if (Pagamentos.size() == 0 ){
                    System.out.println("Insira algum pagamento antes!");
                }else {
                    for (int i = 0; i < Pagamentos.size(); i++) {
                        FormaPagamento p1 = Pagamentos.get(i);

                        if (p1.getTipo() == "Cartão de Crédito"){
                            credito.Info();
                        }
                        if (p1.getTipo() == "Cartão de Débito"){
                            debito.Info();
                        }
                        if (p1.getTipo() == "Boleto"){
                            boleto.Info();
                        }
                        if (p1.getTipo() == "Dinheiro"){
                            dinheiro.Info();
                        }
                    }
                }
            }
        }
        System.out.println("Volte Sempre!");
    }
}