package aula_26_05_2025;

public class Carro extends Veiculo implements Tributavel{
	
	
	public Carro(String placa, String modelo, int ano, double valor) {
		super(placa, modelo, ano, valor);
		
	}

	@Override
	public double calcularImposto() {
		if(getValor() >= 1000.0) {
			return getValor() * (5.0/100.0);
		}
		return 0;
	}

	@Override
	public String getTipoTributacao(String veiculo) {
		
		return veiculo;
	}
}
