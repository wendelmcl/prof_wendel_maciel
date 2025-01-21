package q1;

public class Tv {
	public abstract class Eletrodomestico {
	    protected String marca;
	    protected double preco;
	    protected String modelo;

	    // Construtor
	    public Eletrodomestico(String marca, double preco, String modelo) {
	        this.marca = marca;
	        this.preco = preco;
	        this.modelo = modelo;
	    }

	    // Método abstrato para calcular a garantia estendida
	    public abstract double calcularGarantiaEstendida();
	    
	    // Outros métodos getters e setters
	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }
	}
}
