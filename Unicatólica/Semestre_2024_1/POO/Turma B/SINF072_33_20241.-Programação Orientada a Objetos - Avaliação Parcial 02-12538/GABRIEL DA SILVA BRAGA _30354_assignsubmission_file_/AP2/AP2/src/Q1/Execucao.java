package Q1;

public class Execucao  {
    public static void main(String[] args) {
        Geladeira g1 = new Geladeira();
        g1.setMarca("SAMSUNG");
        g1.setModelo("RT-34");
        g1.setCapacidadeLitros(250);
        g1.setPreco(2700);
        g1.setGarantia(3000);
        g1.calcularGarantiaEstendida();
        
        Tv t1 = new Tv();
        t1.setMarca("SAMSUNG");
        t1.setModelo("QLED 4K");
        t1.setPolegadas(50);
        t1.setPreco(3500);
        t1.setGarantia(3700);
        t1.calcularGarantiaEstendida();
    }
}
