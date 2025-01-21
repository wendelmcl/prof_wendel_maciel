package Q1;
public class TV extends Eletrodomesticos {
    private int polegadas;

    public TV(String marca, String modelo, double preco, int polegadas) {
        super(marca, modelo, preco);
        this.polegadas = polegadas;
    }

    @Override
    public double CalcularGarantiaEstendida() {
        // Cálculo da garantia estendida para TVs
        return 0.03 * getPreco() + 0.02 * polegadas;
    }

    public int getPolegadas() {
        return polegadas;
        
    }
}