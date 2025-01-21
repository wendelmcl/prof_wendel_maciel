package questao01;

class CartaoCredito extends FormaPagamento {
     String numeroCartao;
     String dataValidade;
     String nomeTitular;
     String codigoSeguranca;

    public CartaoCredito(String numeroCartao, String dataValidade, String nomeTitular, String codigoSeguranca, double valor) {
        super("Cart�o de Cr�dito", valor);
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.nomeTitular = nomeTitular;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento efetuado com cart�o de cr�dito.");
    }
}