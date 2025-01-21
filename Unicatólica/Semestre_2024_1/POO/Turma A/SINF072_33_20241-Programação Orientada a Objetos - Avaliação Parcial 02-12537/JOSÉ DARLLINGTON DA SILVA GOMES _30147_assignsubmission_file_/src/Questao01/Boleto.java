package Questao01.SistemaDePagamentos.src;

public class Boleto extends FormaPagamento {
    private int DataVencimento;
    private double Valor;

    public double getValor() {
        return this.Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getDataVencimento() {
        return this.DataVencimento;
    }

    public void setDataVencimento(int DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    @Override
    public void GerarRecibo() {
        System.out.println("Vencimento: " + getDataVencimento() + " efetuando pagamento no valor de " + getValor());

    }

}
