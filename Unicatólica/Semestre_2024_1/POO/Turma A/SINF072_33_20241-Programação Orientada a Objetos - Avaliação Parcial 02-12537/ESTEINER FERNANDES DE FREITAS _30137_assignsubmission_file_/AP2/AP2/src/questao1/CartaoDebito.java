package questao1;

class CartaoDebito extends FormaPagamento {
    private String numeroCartao;
    private int codigoSeguranca;

    public CartaoDebito(String tipo, double valor, String numeroCartao, int codigoSeguranca) {
        super(tipo, valor);
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " processado com cartão de débito.");
    }
}