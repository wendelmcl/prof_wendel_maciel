package questao1;

public class Dinheiro extends FormaPagamento{
	private float valor;
	@Override
	public void gerarRecibo() {
		System.out.println("---RECIBO---");
		System.out.println("Valor da compra : " + this.getValor());
		System.out.println("Forma de Pagamento : " + getTipo());
		System.out.println("Obrigado pela compra!");
	}

	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}

}
