package questao1;

public class Execucao {

    public static void main(String[] args) {
        Geladeira g1 = new Geladeira();
        TV t1 = new TV();

        g1.setMarca("Brastemp");
        g1.setModelo("duas portas");
        g1.setPreco(2.253);

        System.out.println("Geladeira: ");
        System.out.println("marca: " + g1.getMarca());
        System.out.println("Modelo: " + g1.getModelo());
        System.out.println("Preço: " + g1.getPreco());
        System.out.println("Valor da garantia estendida: ");
        g1.calcularGarantiaEstendida();

        t1.setMarca("TCL");
        t1.setModelo("4k");
        t1.setPreco(2.545);

        System.out.println("TV: ");
        System.out.println("Marca: " + t1.getMarca());
        System.out.println("Modelo: " + t1.getModelo());
        System.out.println("Preço: " + t1.getPreco());

        System.out.println("Valor da garantia estendida: ");
        t1.calcularGarantiaEstendida();

    }

}
