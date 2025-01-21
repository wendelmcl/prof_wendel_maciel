package questao;

public class Dinheiro {
	
	double valorPago;
	double valor;
	double troco;
	
	public Dinheiro(){
		
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	void pagamentoDinheiro(){
		System.out.println("O valor pago é: " + valor);
		getValor();
		System.out.println("O valor pago foi: " + valorPago);
		getValorPago();
		if(valorPago > valor){
			troco = valorPago - valor;
			System.out.println("Você recebeu " + getTroco() + "de troco!");
		} else if (valorPago < troco){
			System.out.println("Dinheiro insuficiente!");
		}
	}
	
	

}
