package questao1;

public class TV extends Eletrodomestico {

    @Override
    public void calcularGarantiaEstendida() {
        System.out.println("O valor da garantia extendida é: " + getPreco() + 0.5 * 235);
    }

}
