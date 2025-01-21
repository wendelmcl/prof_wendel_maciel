package questao1;

public class Boleto extends FormaPagamento {
	private String vencimento;
	private float valor;
	
	@Override
	public void gerarRecibo() {
		System.out.println("---RECIBO---");
		System.out.println("Valor da compra : " + this.getValor());
		System.out.println("Forma de Pagamento : " + getTipo());
		System.out.println("Boleto com vencimento : " + this.getVencimento());
		System.out.println("Obrigado pela compra!");
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
