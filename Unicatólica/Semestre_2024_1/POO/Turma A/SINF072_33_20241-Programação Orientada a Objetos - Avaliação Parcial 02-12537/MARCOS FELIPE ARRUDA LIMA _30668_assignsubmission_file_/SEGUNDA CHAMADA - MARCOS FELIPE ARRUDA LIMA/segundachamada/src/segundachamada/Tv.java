package segundachamada;

class Tv extends Eletrodomestico {
    public Tv(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    @Override
    public double calcularGarantiaEstendida() {
        return getPreco() * 0.08; 
    }
}