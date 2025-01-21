package questao1;


public class CartaoCredito extends FormaPagamento {
	private int numCartao;
	private int cvc;
	private String vencimento;
	private float valor;

	@Override
	public void gerarRecibo() {
		System.out.println("---RECIBO---");
		System.out.println("Valor da compra : " + getValor());
		System.out.println("Forma de Pagamento : " + getTipo());
		System.out.println("Cartão de Crédito com vencimento : " + this.vencimento);
		System.out.println("Obrigado pela compra!");
	}
	
	public int getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}


	
	
}
