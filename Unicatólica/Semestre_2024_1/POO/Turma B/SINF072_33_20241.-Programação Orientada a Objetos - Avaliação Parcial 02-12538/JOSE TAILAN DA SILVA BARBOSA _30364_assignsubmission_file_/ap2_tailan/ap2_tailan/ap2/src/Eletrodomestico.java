
public abstract class Eletrodomestico {
    private String marca;
    private String modelo;
    private double preco;

    public Eletrodomestico(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract double calcularGarantiaEstendida();
}


public class q1 extends Eletrodomestico {
    private int capacidadeLitros;

    public q1(String marca, String modelo, double preco, int capacidadeLitros) {
        super(marca, modelo, preco);
        this.capacidadeLitros = capacidadeLitros;
    }

    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    @Override
    public double calcularGarantiaEstendida() {
     
        return getPreco() * 0.05 * capacidadeLitros;
    }
}


public class TV extends Eletrodomestico {
    private int polegadas;

    public TV(String marca, String modelo, double preco, int polegadas) {
        super(marca, modelo, preco);
        this.polegadas = polegadas;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    @Override
    public double calcularGarantiaEstendida() {
   
        return getPreco() * 0.03 * polegadas;
    }
}