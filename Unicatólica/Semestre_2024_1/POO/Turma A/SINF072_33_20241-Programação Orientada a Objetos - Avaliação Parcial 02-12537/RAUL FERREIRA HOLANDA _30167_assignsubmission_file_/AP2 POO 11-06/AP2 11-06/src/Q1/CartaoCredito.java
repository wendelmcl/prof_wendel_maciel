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
        return String.format("Pagamento de R$%.2f via cartão de crédito \n (Número: %s, Código: %s)", getValor(), numeroCartao, codigoSeguranca);
    }
}