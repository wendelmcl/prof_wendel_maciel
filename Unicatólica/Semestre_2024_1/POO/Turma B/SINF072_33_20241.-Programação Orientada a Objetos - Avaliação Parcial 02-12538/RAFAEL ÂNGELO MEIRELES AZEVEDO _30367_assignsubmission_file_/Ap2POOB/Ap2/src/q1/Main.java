package q1;

public class Main {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Brastemp", "BRT45", 2500.0, 450);
        TV tv = new TV("Samsung", "QLED55", 5000.0, 55);

        System.out.println("Geladeira:");
        System.out.println("Marca: " + geladeira.getMarca());
        System.out.println("Modelo: " + geladeira.getModelo());
        System.out.println("Preço: R$ " + geladeira.getPreco());
        System.out.println("Garantia Estendida: R$ " + geladeira.calcularGarantiaEstendida());
        System.out.println();

        System.out.println("TV:");
        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Modelo: " + tv.getModelo());
        System.out.println("Preço: R$ " + tv.getPreco());
        System.out.println("Garantia Estendida: R$ " + tv.calcularGarantiaEstendida());
    }
}
