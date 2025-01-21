package pagamento;

public class Dinheiro extends FormaPagamento{
	double valorRecebido;

    public Dinheiro(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

	public void efetuarPagamento() {
        System.out.println("Pagamento em dinheiro recebido. valor: " + valorRecebido);
    }
}
