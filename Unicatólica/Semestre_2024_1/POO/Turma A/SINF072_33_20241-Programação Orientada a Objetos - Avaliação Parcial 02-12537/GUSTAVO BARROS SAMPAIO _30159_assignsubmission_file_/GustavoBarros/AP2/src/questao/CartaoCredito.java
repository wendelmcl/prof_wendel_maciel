package questao;

public class CartaoCredito {

	int numeroCartao;
	int codigoSeguranca;
	double valor;
	double valorPago;


	public CartaoCredito() {
		

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
	



	void pagamentoCredito() {
		System.out.println("Os n�meros do cart�o s�o: " + numeroCartao);
		getNumeroCartao();
		System.out.println("O c�digo de seguran�a �: " + codigoSeguranca);
		getCodigoSeguranca();
		System.out.println("O valor a ser pago: " + valor);
		getValor();
		System.out.println("O valor foi pago:" + valorPago);
		getValorPago();
		System.out.println("-----------------------");

	}
}
