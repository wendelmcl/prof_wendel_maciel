package quest1;
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
}

// Concrete class Geladeira 
public class Geladeira extends Eletrodomestico {
    private int capacidadeLitros;

    public Geladeira(String marca, String modelo, double preco, int capacidadeLitros) {
        super(marca, modelo, preco);
        this.capacidadeLitros = capacidadeLitros;
    }

    @Override
    public double calcularGarantiaEstendida() {
        // Calcula a garantia estendida para uma geladeira
        return preco * 0.10;
    }
}
