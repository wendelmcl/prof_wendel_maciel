package questao1;

class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private int codigoSeguranca;
    private String dataVencimento;

    public CartaoCredito(String tipo, double valor, String numeroCartao, int codigoSeguranca, String dataVencimento) {
        super(tipo, valor);
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " processado com cartão de crédito.");
    }
}