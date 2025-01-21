package questao1;

public class CartaoDebito extends FormaPagamento {
	private int numDebito;
	private int cvc;
	private String vencimento;
	private float valor;
	@Override
	public void gerarRecibo() {
		System.out.println("---RECIBO---");
		System.out.println("Valor da compra : " + getValor());
		System.out.println("Forma de Pagamento : " + getTipo());
		System.out.println("Número do cartão : " + getNumDebito());
		System.out.println("Cartão de débito com vencimento : " + getVencimento());
		System.out.println("Obrigado pela compra!");
	}
	
	public int getNumDebito() {
		return numDebito;
	}

	public void setNumDebito(int numDebito) {
		this.numDebito = numDebito;
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
