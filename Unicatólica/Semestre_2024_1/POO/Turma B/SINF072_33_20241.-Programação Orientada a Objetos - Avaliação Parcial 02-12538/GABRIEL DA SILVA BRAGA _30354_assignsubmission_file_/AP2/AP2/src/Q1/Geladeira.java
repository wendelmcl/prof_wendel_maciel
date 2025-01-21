package Q1;

public class Geladeira extends Eletrodomestico{
    private double capacidadeLitros;

    @Override
    public void calcularGarantiaEstendida(){
        System.out.println("O modelo da geladeira é " +getModelo());
        System.out.println("A Marca é Samsung " +getMarca());
        System.out.println("O preço é : "+getPreco());
        System.out.println("A capacidade de litros é  "+getCapacidadeLitros());
        System.out.println("o valor com garantia estendida é "+getGarantia());

    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }


    
}
