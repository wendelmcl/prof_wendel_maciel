package questao01;

class CartaoDebito extends FormaPagamento {
    String numeroCartao;
    String nomeTitular;
    String codigoSeguranca;

    public CartaoDebito(String numeroCartao, String nomeTitular, String codigoSeguranca, double valor) {
        super("Cart�o de D�bito", valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento efetuado com cart�o de d�bito.");
    }
}
