package questao01;

abstract class FormaPagamento {
    protected String tipo;
    protected double valor;

    public FormaPagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public abstract void efetuarPagamento();
}
