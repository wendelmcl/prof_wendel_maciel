package primeiraquestão;

public class CartãoCredito extends FormaPagamento1 {
	public int getNumerodocartão() {
		return numerodocartão;
	}
	public void setNumerodocartão(int numerodocartão) {
		this.numerodocartão = numerodocartão;
	}
	public int getCodigosegurança() {
		return codigosegurança;
	}
	public void setCodigosegurança(int codigosegurança) {
		this.codigosegurança = codigosegurança;
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
	private int numerodocartão;
	private int codigosegurança;
	private String titular;
	private int datavencimento;

}
