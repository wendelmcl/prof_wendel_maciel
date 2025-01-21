package Questao01.SistemaDePagamentos.src;

public class Dinheiro extends FormaPagamento {
    private double Valor;

    public double getValor() {
        return this.Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    @Override
    public void GerarRecibo() {
        System.out.println("Pagamento efetuado no valor de: " + getValor());

    }
}
