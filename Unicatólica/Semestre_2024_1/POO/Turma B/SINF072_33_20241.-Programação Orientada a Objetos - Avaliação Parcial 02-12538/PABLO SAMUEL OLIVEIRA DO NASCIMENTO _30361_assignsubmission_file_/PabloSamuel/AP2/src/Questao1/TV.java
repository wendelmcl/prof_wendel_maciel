package Questao1;

public class TV extends Eletrodomesticos {
    public TV(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    @Override
    public double calcularGarantiaEstendida() {
        
        return this.preco;
    }


}



