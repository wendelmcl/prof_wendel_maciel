package primeiraquest�o;

public class Cart�oCredito extends FormaPagamento1 {
	public int getNumerodocart�o() {
		return numerodocart�o;
	}
	public void setNumerodocart�o(int numerodocart�o) {
		this.numerodocart�o = numerodocart�o;
	}
	public int getCodigoseguran�a() {
		return codigoseguran�a;
	}
	public void setCodigoseguran�a(int codigoseguran�a) {
		this.codigoseguran�a = codigoseguran�a;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getDatavencimento() {
		return datavencimento;
	}
	public void setDatavencimento(int datavencimento) {
		this.datavencimento = datavencimento;
	}
	private int numerodocart�o;
	private int codigoseguran�a;
	private String titular;
	private int datavencimento;

}
