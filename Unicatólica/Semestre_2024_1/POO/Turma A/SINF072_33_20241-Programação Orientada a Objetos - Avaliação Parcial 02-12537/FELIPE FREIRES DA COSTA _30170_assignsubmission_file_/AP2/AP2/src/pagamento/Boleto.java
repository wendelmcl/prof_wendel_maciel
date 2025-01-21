package pagamento;

public class Boleto extends FormaPagamento{
	 private String codigoBarra;
	 private String produto;
	 private double valor;
	 
	 
	    public Boleto(String codigoBarra, String produto, double valor) {
	        this.codigoBarra = codigoBarra;
	        this.produto = produto;
	        this.valor = valor;
	    }

	 

		public void efetuarPagamento() {
	        System.out.println("Pagamento realizado com boleto, Produto comprado:  " + produto + " valor: " + valor);
	    }
}
