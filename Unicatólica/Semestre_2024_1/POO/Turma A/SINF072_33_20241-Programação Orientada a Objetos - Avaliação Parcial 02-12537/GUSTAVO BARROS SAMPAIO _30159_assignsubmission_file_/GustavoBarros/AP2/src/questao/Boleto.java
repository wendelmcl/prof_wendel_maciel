package questao;

public class Boleto {

	double valor;
	double valorPago;
	double troco;

	public Boleto() {
		
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

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	void pagamentoBoleto() {
		System.out.println("O valor a ser pago é: " + valor);
		getValor();
		System.out.println("O valor pago foi: " + valorPago);
		getValorPago();
		if(valorPago > valor){
			troco = valorPago - valor;
			System.out.println("Você recebeu " + getTroco() + "de troco!");
		} 

	}

}
