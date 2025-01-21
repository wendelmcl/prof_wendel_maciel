package Ap2;

public class TV extends Eletrodomestico {
    public TV(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    @Override
    public double calcularGarantiaEstendida() {
        return getPreco() * 0.15; 
    }
}

