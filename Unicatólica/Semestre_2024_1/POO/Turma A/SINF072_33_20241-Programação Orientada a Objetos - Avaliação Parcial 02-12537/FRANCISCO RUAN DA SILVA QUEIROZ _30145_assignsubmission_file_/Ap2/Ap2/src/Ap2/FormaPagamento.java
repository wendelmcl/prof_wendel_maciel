package Ap2;

abstract class FormaPagamento {
    protected String tipo;
    protected double valor;

    public FormaPagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public abstract void imprimirRecibo();
}

class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;

    public CartaoCredito(String tipo, double valor, String numeroCartao, String nomeTitular, String dataValidade) {
        super(tipo, valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
    }

    public void imprimirRecibo() {
        System.out.println("Recibo - Cartão de Crédito");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: R$" + valor);
        System.out.println("Número do Cartão: " + numeroCartao);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Data de Validade: " + dataValidade);
    }
}

class CartaoDebito extends FormaPagamento {
    private String numeroCartao;
    private String nomeTitular;

    public CartaoDebito(String tipo, double valor, String numeroCartao, String nomeTitular) {
        super(tipo, valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    public void imprimirRecibo() {
        System.out.println("Recibo - Cartão de Débito");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: R$" + valor);
        System.out.println("Número do Cartão: " + numeroCartao);
        System.out.println("Nome do Titular: " + nomeTitular);
    }
}

class Boleto extends FormaPagamento {
    private String codigoBoleto;

    public Boleto(String tipo, double valor, String codigoBoleto) {
        super(tipo, valor);
        this.codigoBoleto = codigoBoleto;
    }

    public void imprimirRecibo() {
        System.out.println("Recibo - Boleto");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: R$" + valor);
        System.out.println("Código do Boleto: " + codigoBoleto);
    }
}

class Dinheiro extends FormaPagamento {
    private double valorPago;

    public Dinheiro(String tipo, double valor, double valorPago) {
        super(tipo, valor);
        this.valorPago = valorPago;
    }

    public void imprimirRecibo() {
        System.out.println("Recibo - Dinheiro");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor Total da Compra: R$" + valor);
        System.out.println("Valor Pago: R$" + valorPago);
        System.out.println("Troco: R$" + (valorPago > valor ? valorPago - valor : 0));
    }
}
