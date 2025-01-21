package questao01;

class Dinheiro extends FormaPagamento {

    public Dinheiro(double valor) {
        super("Dinheiro", valor);
    }

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento efetuado em dinheiro.");
    }
}
