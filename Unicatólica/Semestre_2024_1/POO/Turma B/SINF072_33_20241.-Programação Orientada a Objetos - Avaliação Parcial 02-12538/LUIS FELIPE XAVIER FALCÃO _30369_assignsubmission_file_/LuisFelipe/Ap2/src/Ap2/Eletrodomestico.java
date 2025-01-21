package Ap2;

	public abstract class Eletrodomestico {
	    private String marca;
	    private String modelo;
	    private double preco;

	    public Eletrodomestico(String marca, String modelo, double preco) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.preco = preco;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public abstract double calcularGarantiaEstendida();


}
