package Q1;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String codigoSeguranca;

    public CartaoCredito(double valor, String numeroCartao, String codigoSeguranca) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public String gerarRecibo() {
        return String.format("Pagamento de R$%.2f via cart�o de cr�dito \n (N�mero: %s, C�digo: %s)", getValor(), numeroCartao, codigoSeguranca);
    }
}