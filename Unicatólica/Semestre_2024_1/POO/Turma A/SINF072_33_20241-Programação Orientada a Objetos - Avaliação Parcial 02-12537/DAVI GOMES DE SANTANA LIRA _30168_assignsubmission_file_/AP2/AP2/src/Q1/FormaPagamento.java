package Q1;


public abstract class FormaPagamento {
	private double credito, debito, boleto, dinheiro, valor = 150.0;
	
	public void FormaPagamentoS(){
		System.out.println("1- CREDITO");
		System.out.println("2- DEBITO");
		System.out.println("3- DINHEIRO");
		System.out.println("4- BOLETO");
	}
	
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}

	public double getBoleto() {
		return boleto;
	}

	public void setBoleto(double boleto) {
		this.boleto = boleto;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
