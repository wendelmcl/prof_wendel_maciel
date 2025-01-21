package Q1;
public abstract class Eletrodomesticos {
    protected String marca;
    protected String modelo;
    protected double preco;

    public Eletrodomesticos(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public abstract double CalcularGarantiaEstendida();

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
