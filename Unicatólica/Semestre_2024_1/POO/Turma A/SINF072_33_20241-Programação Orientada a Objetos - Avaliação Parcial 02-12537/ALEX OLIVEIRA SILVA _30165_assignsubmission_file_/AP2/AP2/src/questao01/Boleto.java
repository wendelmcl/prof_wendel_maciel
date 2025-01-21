package questao01;

class Boleto extends FormaPagamento {
    String codigoBarras;

    public Boleto(String codigoBarras, double valor) {
        super("Boleto", valor);
        this.codigoBarras = codigoBarras;
    }
    
    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento efetuado com boleto.");
    }
}
