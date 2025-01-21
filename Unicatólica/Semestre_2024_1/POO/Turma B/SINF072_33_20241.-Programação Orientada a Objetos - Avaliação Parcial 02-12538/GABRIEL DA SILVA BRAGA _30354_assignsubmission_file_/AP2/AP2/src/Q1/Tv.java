package Q1;

public class Tv extends Eletrodomestico{
    @Override
    public void calcularGarantiaEstendida() {
        System.out.println("O modelo é "+getModelo());
        System.out.println("A marca é  "+getMarca());
        System.out.println("seu valor é  "+getPreco());
        System.out.println("é uma Tv TEM "+getPolegadas());
        System.out.println("o valor com garantia estendida é "+getGarantia());

        
    }

    private int polegadas;

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    } 


}
