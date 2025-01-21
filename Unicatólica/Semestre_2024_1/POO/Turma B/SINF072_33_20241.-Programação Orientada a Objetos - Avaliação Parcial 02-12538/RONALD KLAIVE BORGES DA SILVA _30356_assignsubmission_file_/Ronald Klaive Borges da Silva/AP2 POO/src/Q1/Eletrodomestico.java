package Q1;

public abstract class Eletrodomestico {
    protected String marca;
    protected String modelo;
    protected double preco;

    public Eletrodomestico(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public abstract double calcularGarantiaEstendida();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }
}
