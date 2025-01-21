package q1;

public class Execucao {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Linux", "BRT45", 1443.0, 134);
        Tv tv = new Tv("Samsung", "QLED55", 230.0, 60);

        System.out.println("Geladeira:");
        System.out.println("Marca: " + geladeira.getMarca());
        System.out.println("Modelo: " + geladeira.getModelo());
        System.out.println("Preço: R$ " + geladeira.getPreco());
        System.out.println("Garantia extendida: R$ " + geladeira.calcularGarantiaExtendida());

        System.out.println("\nTV:");
        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Modelo: " + tv.getModelo());
        System.out.println("Preço: R$ " + tv.getPreco());
        System.out.println("Garantia extendida: R$ " + tv.calcularGarantiaExtendida());
    }
}

