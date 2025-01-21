package q1;

public class Geladeira extends Eletrodomestico {

    @Override
    public void imprimirInformacoes() {
        setMarca("Esmaltec");
        setModelo(100033);
        setPreco(3000.00);
        
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: " + getPreco());
        
        // TODO Auto-generated method stub
        super.imprimirInformacoes();
    }

    @Override
    public void calcularGarantiaEstendida() {
        setGarantia((0.1 * getPreco()));

        System.out.println("A Garantia Estendida do produto é: " + getGarantia());

        // TODO Auto-generated method stub
        super.calcularGarantiaEstendida();

    }

}
