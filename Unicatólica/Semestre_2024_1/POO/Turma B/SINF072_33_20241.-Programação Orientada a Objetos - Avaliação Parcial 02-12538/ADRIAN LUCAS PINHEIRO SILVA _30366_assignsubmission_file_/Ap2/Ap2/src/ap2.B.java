
abstract class Eletrodomestico {
    private String marca;
    private String modelo;
    private double preco;

    public Eletrodomestico(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    } 
    public String exibirDetalhes() {
        return String.format("Marca: %s\nModelo: %s\nPreço: R$%.2f", marca, modelo, preco);
    }

    public abstract double calcularGarantiaEstendida(int anos);
}

 Classe concreta Geladeira
class Geladeira extends Eletrodomestico {
    private int capacidade;
    private boolean possuiFreezer;

    public Geladeira(String marca, String modelo, double preco, int capacidade, boolean possuiFreezer) {
        super(marca, modelo, preco);
        this.capacidade = capacidade;
        this.possuiFreezer = possuiFreezer;
    }
    public double calcularGarantiaEstendida(int anos) {
        // Suponhamos que a garantia estendida para geladeiras seja 5% do preço por ano
        return getPreco() * 0.05 * anos;
    }

    
    public String exibirDetalhes() {
        String detalhes = super.exibirDetalhes();
        String freezerInfo = possuiFreezer ? "sim" : "não";
        return String.format("Geladeira:\n%s\nCapacidade: %d litros\nPossui Freezer: %s", detalhes, capacidade, freezerInfo);
    }
}

 Classe concreta TV
class TV extends Eletrodomestico {
    private int tamanho;
    private String resolucao;

    public TV(String marca, String modelo, double preco, int tamanho, String resolucao) {
        super(marca, modelo, preco);
        this.tamanho = tamanho;
        this.resolucao = resolucao;
    }
    public double calcularGarantiaEstendida(int anos) {
        // Suponhamos que a garantia estendida para TVs seja 7% do preço por ano
        return getPreco() * 0.07 * anos;
    }
    public String exibirDetalhes() {
        String detalhes = super.exibirDetalhes();
        return String.format("TV:\n%s\nTamanho: %d polegadas\nResolução: %s", detalhes, tamanho, resolucao);
    }
}
public class Main {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Brastemp", "BR450", 3500.00, 450, true);
        TV tv = new TV("Samsung", "UA55", 2800.00, 55, "4K");

        System.out.println(geladeira.exibirDetalhes());
        System.out.printf("Valor da garantia estendida por 3 anos: R$%.2f%n", geladeira.calcularGarantiaEstendida(3));
        System.out.println();
        System.out.println(tv.exibirDetalhes());
        System.out.printf("Valor da garantia estendida por 2 anos: R$%.2f%n", tv.calcularGarantiaEstendida(2));
    }