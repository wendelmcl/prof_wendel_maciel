package pagamento;

public class CartaoDebito extends FormaPagamento{
	private String NomeConta;
	private String valor;
	private String NumeroConta;
	
	
    public CartaoDebito(String NomeConta, String valor, String NumeroConta) {
        this.NumeroConta = NumeroConta;
        this.valor = valor;
        this.NomeConta = NumeroConta;
    }

  

	public void efetuarPagamento() {
        System.out.println("Pagamento realizado com cartão de débito. valor:" + valor + " Cliente: " + NomeConta );
    }
}
