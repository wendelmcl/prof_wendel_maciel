package Q1;
import java.util.Scanner;

public class Main {
    private static final double preco = 0;

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do eletrodoméstico:");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do eletrodoméstico:");
        String modelo = scanner.nextLine();

        System.out.println("Digite o Preço do eletrodoméstico:");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Digite o tipo de eletrodoméstico (Geladeira ou TV):");
        String tipo = scanner.nextLine();

        if (tipo.equalsIgnoreCase("Geladeira")) {
            System.out.println("Digite a capacidade de refrigeração:");
            int capacidadeLitros = scanner.nextInt();
            scanner.nextLine();

            Geladeira geladeira = new Geladeira(marca, modelo, preco, capacidadeLitros);
            System.out.println("Geladeira:");
            System.out.println("Marca: " + geladeira.getMarca());
            System.out.println("Modelo: " + geladeira.getModelo());
            System.out.println("Preço: " + geladeira.getPreco() + " kg");
            System.out.println("Capacidade: " + geladeira.getCapacidadeLitros()+ " litros");
            System.out.println("Garantia estendida: R$ " + geladeira.CalcularGarantiaEstendida());
        } else if (tipo.equalsIgnoreCase("TV")) {
            System.out.println("Digite a tela da TV (polegadas):");
            final int polegadas = scanner.nextInt();
            scanner.nextLine(); 

            TV tv = new TV(marca, modelo, preco, polegadas);
            System.out.println("TV:");
            System.out.println("Marca: " + tv.getMarca());
            System.out.println("Modelo: " + tv.getModelo());
            System.out.println("Preço: " + tv.getPreco());
            System.out.println("Tamanho: " + tv.getPolegadas() + " polegadas");
            System.out.println("Garantia estendida: R$ " + tv.CalcularGarantiaEstendida());
        } else {
            System.out.println("Tipo de eletrodoméstico inválido.");
        }
    }
}