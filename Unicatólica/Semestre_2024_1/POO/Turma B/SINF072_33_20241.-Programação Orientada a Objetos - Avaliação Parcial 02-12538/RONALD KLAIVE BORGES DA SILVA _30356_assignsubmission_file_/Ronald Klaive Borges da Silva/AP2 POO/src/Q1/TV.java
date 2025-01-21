package Q1;

public class TV extends Eletrodomestico {
    private int polegadas;

    public TV(String marca, String modelo, double preco, int polegadas) {
        super(marca, modelo, preco);
        this.polegadas = polegadas;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return preco * 0.03 * polegadas;
    }
}