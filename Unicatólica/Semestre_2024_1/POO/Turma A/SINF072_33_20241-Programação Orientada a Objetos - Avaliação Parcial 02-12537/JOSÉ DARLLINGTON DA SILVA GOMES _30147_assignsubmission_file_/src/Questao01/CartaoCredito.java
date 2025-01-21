package Questao01.SistemaDePagamentos.src;

public class CartaoCredito extends FormaPagamento {
    private int NumeroCartao;
    private int CodigoSegurança;
    private int DataVencimento;
    private double Valor;

    public double getValor() {
        return this.Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getNumeroCartao() {
        return this.NumeroCartao;
    }

    public void setNumeroCartao(int NumeroCartao) {
        this.NumeroCartao = NumeroCartao;
    }

    public int getCodigoSegurançA() {
        return this.CodigoSegurança;
    }

    public void setCodigoSegurançA(int CodigoSegurança) {
        this.CodigoSegurança = CodigoSegurança;
    }

    public int getDataVencimento() {
        return this.DataVencimento;
    }

    public void setDataVencimento(int DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    @Override
    public void GerarRecibo() {
        System.out
                .println("Código de Segurança: " + getCodigoSegurançA() + ", Data Vencimento: " + getDataVencimento() +
                        " Número do cartão: " + getNumeroCartao() + " efetuando pagamento no valor de " + getValor());
    }

}
