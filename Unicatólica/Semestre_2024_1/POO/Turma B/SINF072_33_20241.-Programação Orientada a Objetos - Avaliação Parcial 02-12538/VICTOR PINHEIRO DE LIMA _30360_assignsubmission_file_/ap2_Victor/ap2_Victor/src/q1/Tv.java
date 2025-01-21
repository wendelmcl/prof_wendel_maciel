package q1;

public class Tv extends Eletrodomestico {
    private int polegadas;

    public Tv(String marca, String modelo, double preco, int polegadas) {
        super(marca, modelo, preco);
        this.polegadas = polegadas;
    }

    public double calcularGarantiaExtendida() {
        return getPreco() * 0.15 + (polegadas * 0.1);
    }
}
