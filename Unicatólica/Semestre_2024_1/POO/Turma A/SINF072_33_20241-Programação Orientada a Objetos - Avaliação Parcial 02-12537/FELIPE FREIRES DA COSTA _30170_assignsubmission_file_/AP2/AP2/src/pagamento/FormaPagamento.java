
package pagamento;



public abstract class FormaPagamento  {
	private int cartaoCredito;
	private int debito;
	private int boleto;
	private boolean dinheiro;
	
	
	public void pagamento(int cartaoCredito, int debito, int boleto, Boolean dinheiro){
		this.cartaoCredito = cartaoCredito;
		this.debito = debito;
		this.boleto = boleto;
		this.dinheiro = dinheiro;
		
	}


	public void efetuarPagamento() {
		
		
	}
	
	
}
