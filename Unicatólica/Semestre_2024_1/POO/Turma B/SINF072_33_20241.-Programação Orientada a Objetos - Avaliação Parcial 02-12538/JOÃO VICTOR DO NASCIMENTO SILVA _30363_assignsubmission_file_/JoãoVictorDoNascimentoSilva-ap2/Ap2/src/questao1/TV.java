package questao1;
public class TV extends Eletrodomestico {
    private int polegadas;

    @Override
    public void calcularGarantiaEstendida() {
        System.out.println("Garantia extendida de uma partida de futebol inteira ativa");
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("A marca do produto é "+getMarca());
        System.out.println("O modelo do produto é "+getModelo());
        System.out.println("O preço do produto é "+getPreco());
        System.out.println("O produto tem "+polegadas+" polegadas");
    }
    
}
