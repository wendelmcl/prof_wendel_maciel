package questao1;

public class Main {
    public static void main(String[] args) {
        SistemaPagamentos sistema = new SistemaPagamentos();

        sistema.adicionarFormaPagamento(new CartaoCredito("Cartão de Crédito", 100.0, "1234 5678 9012 3456", 123, "01/25"));
        sistema.adicionarFormaPagamento(new CartaoDebito("Cartão de Débito", 50.0, "9876 5432 1098 7654", 456));
        sistema.adicionarFormaPagamento(new Boleto("Boleto", 200.0, "1234567890123456789012345678901234567890"));
        sistema.adicionarFormaPagamento(new Dinheiro("Dinheiro", 150.0));

        sistema.processarPagamento(0);
        sistema.processarPagamento(1);
        sistema.processarPagamento(2);
        sistema.processarPagamento(3);
    }
}