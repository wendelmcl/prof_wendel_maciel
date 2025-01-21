package Questao01.SistemaDePagamentos.src;

public abstract class FormaPagamento {
    private double Valor;

    public double getValor() {
        return this.Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void GerarRecibo() {
        System.out.println("Pagamento efetuado");
    }

}
