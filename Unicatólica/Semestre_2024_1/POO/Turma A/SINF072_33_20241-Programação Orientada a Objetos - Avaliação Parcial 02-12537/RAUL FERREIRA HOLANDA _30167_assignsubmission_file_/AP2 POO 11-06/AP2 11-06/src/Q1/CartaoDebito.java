package Q1;

public class CartaoDebito extends FormaPagamento {
    private String numeroCartao;

    public CartaoDebito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public String gerarRecibo() {
        return String.format("Pagamento de R$%.2f via cart�o de d�bito (N�mero: %s)", getValor(), numeroCartao);
    }
}
