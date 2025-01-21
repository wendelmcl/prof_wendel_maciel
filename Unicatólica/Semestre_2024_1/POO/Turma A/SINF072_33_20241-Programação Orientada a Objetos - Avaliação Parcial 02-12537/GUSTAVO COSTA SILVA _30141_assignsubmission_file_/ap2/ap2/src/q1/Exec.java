package q1;

import java.util.ArrayList;

public class Exec {
    public static void main (String args[]){
        ArrayList <Dinheiro> Din = new ArrayList<>();
        ArrayList <CartaoCredito> Cc = new ArrayList<>();
        ArrayList <CartaoDebit> Cd = new ArrayList<>();
        ArrayList <Boleto> Bo = new ArrayList<>();
        CartaoCredito Master = new CartaoCredito();
        CartaoDebit Visa = new CartaoDebit();
        Boleto B1 = new Boleto();
        Dinheiro Carteira = new Dinheiro();
        Din.add(Carteira);
        Cc.add(Master);
        Cd.add(Visa);
        Bo.add(B1);
        
        System.out.println("Pagamento realizado por Dinheiro, Você tinha um saldo de "+Din.get(0).quantidade);
        System.out.println("Pagamento do produto realizado, pelo cartão com as seguintes credenciais "+Cc.get(0).numCart+" "+Cc.get(0).CVV);
        System.out.println("Pagamento do produto realizado, pelo cartão com as seguintes credenciais "+Cd.get(0).numCart+" "+Cd.get(0).CVV);
        System.out.println("Pagamento realizada via Boleto, o produto será enviado apenas após a compensação do pagamento que é"+Bo.get(0).diasParaCompensar);
    }
}
