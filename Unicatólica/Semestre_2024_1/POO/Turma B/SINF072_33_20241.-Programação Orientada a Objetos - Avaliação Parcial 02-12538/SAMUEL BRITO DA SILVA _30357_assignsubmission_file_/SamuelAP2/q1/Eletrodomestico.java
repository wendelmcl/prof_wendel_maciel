package q1;

public abstract class Eletrodomestico {
    private String Marca;
    private int Modelo;
    private double Preco;
    private double Garantia;

    public double getGarantia() {
        return Garantia;
    }

    public void setGarantia(double garantia) {
        Garantia = garantia;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int modelo) {
        Modelo = modelo;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public void imprimirInformacoes(){
        
    }

    public void calcularGarantiaEstendida() {    
        
    }
}
