package questao1;

class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String tipo, double valor, String codigoBarras) {
        super(tipo, valor);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " processado com boleto.");
    }
}