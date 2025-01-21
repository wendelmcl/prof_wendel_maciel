package Ap2;

import java.util.ArrayList;

public class SistemaPagamento {
    public static void main(String[] args) {
        ArrayList<FormaPagamento> formasPagamento = new ArrayList<>();
        
        formasPagamento.add(new CartaoCredito("Cartão de Crédito", 100.00, "4848 5678 9012 3456", "Ruan Queiroz", "12/25"));
        formasPagamento.add(new CartaoDebito("Cartão de Débito", 70.00, "9876 8414 2814 7654", "Karelly Nascimento"));
        formasPagamento.add(new Boleto("Boleto", 20.00, "123456789"));
        formasPagamento.add(new Dinheiro("Dinheiro", 135.00, 854.00));
        
        for (FormaPagamento forma : formasPagamento) {
            forma.imprimirRecibo();
            System.out.println();
        }
    }
}
