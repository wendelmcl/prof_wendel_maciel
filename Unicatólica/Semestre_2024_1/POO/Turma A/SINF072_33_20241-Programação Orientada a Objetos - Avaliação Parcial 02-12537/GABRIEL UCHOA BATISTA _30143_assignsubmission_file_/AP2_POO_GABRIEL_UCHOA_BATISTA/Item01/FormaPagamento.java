package Item01;

public abstract class FormaPagamento {
    private String tipo;
    private Double valor;

    public FormaPagamento (String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
