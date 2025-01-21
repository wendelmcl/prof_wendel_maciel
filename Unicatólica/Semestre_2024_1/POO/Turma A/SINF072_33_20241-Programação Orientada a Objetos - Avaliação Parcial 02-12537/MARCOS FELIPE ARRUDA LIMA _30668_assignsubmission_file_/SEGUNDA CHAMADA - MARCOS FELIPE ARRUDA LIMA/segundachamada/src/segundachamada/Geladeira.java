package segundachamada;

class Geladeira extends Eletrodomestico {
	public Geladeira(String marca, String modelo, double preco) {
		super(marca, modelo, preco);
	   	}
	    @Override
	    public double calcularGarantiaEstendida() {
	    return getPreco() * 0.5; 
	    }
}