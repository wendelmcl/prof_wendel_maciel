package Q1;
public class Geladeira extends Eletrodomesticos {
    private int capacidadeLitros;

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public Geladeira(String marca, String modelo, double preco, int capacidadeLitros) {
        super(marca, modelo, preco);
        this.capacidadeLitros = capacidadeLitros;
    }

    @Override
    public double CalcularGarantiaEstendida() {
        // Cálculo da garantia estendida para geladeiras
        return 0.05 * getPreco() + 0.01 * capacidadeLitros;
    }



    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }
}