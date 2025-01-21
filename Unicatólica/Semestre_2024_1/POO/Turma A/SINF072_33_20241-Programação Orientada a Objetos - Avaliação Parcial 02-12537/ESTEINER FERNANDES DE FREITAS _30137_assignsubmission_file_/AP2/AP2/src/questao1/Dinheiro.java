package questao1;

class Dinheiro extends FormaPagamento {
    public Dinheiro(String tipo, double valor) {
        super(tipo, valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " recebido em dinheiro.");
    }
}