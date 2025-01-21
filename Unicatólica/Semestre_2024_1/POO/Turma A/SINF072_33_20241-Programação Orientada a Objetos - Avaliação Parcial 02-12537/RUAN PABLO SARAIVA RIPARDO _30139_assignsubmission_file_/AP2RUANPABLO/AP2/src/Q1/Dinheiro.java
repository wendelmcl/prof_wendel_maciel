package Q1;

public class Dinheiro extends FormaPagamento {
	private Double Saldo;
	private Double troco;
	
	

	public Dinheiro(String tipo, Double valor, Double saldo) {
		super(tipo, valor);
		Saldo = saldo;
	}



	public Double getTroco() {
		return getValor() - this.Saldo ;
	}

	public void imprimirDetalhes() {
		System.out.printf("Tipo: %s %n Valor: %.2f Saldo: %.2f troco: %.2f" , getTipo() , getValor(), getTroco());
	}
	
	
	
	

}
