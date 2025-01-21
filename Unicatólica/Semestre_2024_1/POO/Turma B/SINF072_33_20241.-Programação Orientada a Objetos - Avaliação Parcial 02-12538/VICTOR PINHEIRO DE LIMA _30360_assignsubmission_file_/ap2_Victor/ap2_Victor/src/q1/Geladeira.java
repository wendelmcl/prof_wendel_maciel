package q1;

public class Geladeira extends Eletrodomestico {
	    private int capacidadeLitros;
	    public Geladeira(String marca, String modelo, double preco, int capacidadeLitros) {
	        super(marca, modelo, preco);
	        this.capacidadeLitros = capacidadeLitros;
	    }

	    public double calcularGarantiaExtendida() {
	        return getPreco() * 0.3 + (capacidadeLitros * 0.03);
	    }
	}
