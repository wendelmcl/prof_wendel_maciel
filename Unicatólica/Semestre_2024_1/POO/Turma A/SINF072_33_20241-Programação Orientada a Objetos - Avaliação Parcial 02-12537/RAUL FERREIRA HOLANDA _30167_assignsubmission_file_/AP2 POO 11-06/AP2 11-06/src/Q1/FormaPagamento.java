package Q1;

public abstract class FormaPagamento {
    private double valor;

    
    public FormaPagamento(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    
    public abstract String gerarRecibo();

    
}

