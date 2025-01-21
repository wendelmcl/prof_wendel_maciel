package Questao1;

public class Geladeira extends Eletrodomesticos {
    public Geladeira(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    @Override
    public double calcularGarantiaEstendida() {
        return this.preco;
    }
}
	


