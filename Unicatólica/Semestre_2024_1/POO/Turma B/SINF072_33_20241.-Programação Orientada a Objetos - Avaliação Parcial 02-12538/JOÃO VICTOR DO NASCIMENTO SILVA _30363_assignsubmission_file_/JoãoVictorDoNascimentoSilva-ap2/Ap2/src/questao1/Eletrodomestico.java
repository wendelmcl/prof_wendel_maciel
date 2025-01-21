package questao1;

public abstract class Eletrodomestico {
    private String marca;
    private String modelo;
    private int preco;

    public abstract void imprimirInformacoes();    
    public abstract void calcularGarantiaEstendida();


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


    public int getPreco() {
        return preco;
    }


    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    
}
