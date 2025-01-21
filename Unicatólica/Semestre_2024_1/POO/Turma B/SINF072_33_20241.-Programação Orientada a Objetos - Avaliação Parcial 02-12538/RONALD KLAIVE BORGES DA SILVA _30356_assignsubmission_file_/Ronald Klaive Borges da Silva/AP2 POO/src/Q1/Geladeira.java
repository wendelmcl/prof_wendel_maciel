package Q1;

public class Geladeira extends Eletrodomestico {
    private int capacidadeLitros;

    public Geladeira(String marca, String modelo, double preco, int capacidadeLitros) {
        super(marca, modelo, preco);
        this.capacidadeLitros = capacidadeLitros;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return preco * 0.05 * capacidadeLitros;
    }
}