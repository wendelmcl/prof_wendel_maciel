package Q1;

public class Boleto extends FormaPagamento {
    private String codigoBoleto;

    public Boleto(double valor, String codigoBoleto) {
        super(valor);
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public String gerarRecibo() {
        return String.format("Pagamento de R$%.2f via boleto (Código: %s)", getValor(), codigoBoleto);
    }
}
