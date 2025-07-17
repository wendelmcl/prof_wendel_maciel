package classes_abstratas_e_interface;

public class Moto extends Veiculo implements Tributavel{
	private double valorBase;
	
	public Moto(String placa, String modelo, int ano, double valorBase) {
		super(placa, modelo, ano);
		this.valorBase = valorBase;
	}
	
	@Override
	public double calcularImposto() {
		double imposto = 0.0;
		if(valorBase >= 500.0) {
			imposto = valorBase * (2.0 / 100.0);
			return imposto;
		}
		return imposto;
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	@Override
	public String getTipoTributacao() {
		return "Tipo de tributação: Motocicleta Rural";
	}
}
