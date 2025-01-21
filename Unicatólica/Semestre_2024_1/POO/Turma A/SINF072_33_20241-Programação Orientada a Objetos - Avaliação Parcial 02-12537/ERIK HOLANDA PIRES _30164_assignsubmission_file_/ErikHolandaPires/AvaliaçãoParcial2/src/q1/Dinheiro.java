package q1;

public class Dinheiro extends FormaPagamento{
	private double quantDinheiro;

	public double getQuantDinheiro() {
		return quantDinheiro;
	}

	public void setQuantDinheiro(double quantDinheiro) {
		this.quantDinheiro = quantDinheiro;
	}

	@Override
	public void processarPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String gerarRecibo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
