package q1;

public class TV extends Eletrodomestico {

    @Override
    public void imprimirInformacoes() {
        setMarca("Samsung");
        setModelo(100033);
        setPreco(1599.99);

        System.out.println("Marca: " +getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: " + getPreco());

        // TODO Auto-generated method stub
        super.imprimirInformacoes();
    }

    @Override
    public void calcularGarantiaEstendida() {
        setGarantia((0.3 * getPreco()));

        System.out.println("A Garantia Estendida do produto é: " + getGarantia());

        // TODO Auto-generated method stub
        super.calcularGarantiaEstendida();
    }

    

}
