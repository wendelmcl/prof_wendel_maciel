package questao;


public class CartaoDebito {

	int numeroCartao;
	int codigoSeguranca;
	double valor;
	double valorPago;

	public CartaoDebito() {
		

	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(int codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	



	void pagamentoDebito() {
		System.out.println("Os números do cartão são: " + numeroCartao);
		getNumeroCartao();
		System.out.println("O código de segurança é: " + codigoSeguranca);
		getCodigoSeguranca();
		System.out.println("O valor a ser pago: " + valor);
		getValor();
		System.out.println("O valor foi pago:" + valorPago);
		getValorPago();
		System.out.println("-----------------------");

	}
}
