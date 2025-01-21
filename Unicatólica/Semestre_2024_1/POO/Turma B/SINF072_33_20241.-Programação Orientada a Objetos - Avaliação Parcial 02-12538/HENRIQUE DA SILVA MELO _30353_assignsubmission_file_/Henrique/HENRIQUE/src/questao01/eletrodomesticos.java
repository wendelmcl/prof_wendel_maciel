// Classe abstrata Eletrodomésticos
abstract class Eletrodomésticos {
	protected String marca;
	protected String modelo;
	protected double preco;
	
	// Construtor
	public Eletrodomestico(String marca, Sting modelo, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public double getPreco()
	    return preco;
    }

    public abstract double calcularGarantiaEstendida();
	

}
