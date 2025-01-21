package Q1;

//Você está desenvolvendo um sistema para uma loja de eletrodomésticos. Existem diferentes tipos de produtos, como Geladeira e TV, cada um com suas características específicas. Implemente as classes necessárias utilizando uma classe abstrata. Crie uma classe abstrata Eletrodomestico que contenha atributos comuns a todos os eletrodomésticos, como marca, modelo e preço. Implemente métodos abstratos calcularGarantiaEstendida() que calcula o valor da garantia estendida para cada tipo de eletrodoméstico. Implemente classes concretas Geladeira e TV que estendem Eletrodomestico, cada um implementando o método abstrato calcularGarantiaEstendida() de acordo com suas particularidades.//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de eletrodoméstico:");
        System.out.println("1 - Geladeira");
        System.out.println("2 - TV");
        System.out.println("Digite aqui: ");
        int opcao = scanner.nextInt();

        Eletrodomestico eletrodomestico = null;

        if (opcao == 1) {
            System.out.println("Informe a marca da geladeira:");
            String marca = scanner.next();
            System.out.println("Informe o modelo da geladeira:");
            String modelo = scanner.next();
            System.out.println("Informe o preço da geladeira:");
            double preco = scanner.nextDouble();
            System.out.println("Informe a capacidade em litros da geladeira:");
            int capacidadeLitros = scanner.nextInt();
            eletrodomestico = new Geladeira(marca, modelo, preco, capacidadeLitros);
        } else if (opcao == 2) {
            System.out.println("Informe a marca da TV:");
            String marca = scanner.next();
            System.out.println("Informe o modelo da TV:");
            String modelo = scanner.next();
            System.out.println("Informe o preço da TV:");
            double preco = scanner.nextDouble();
            System.out.println("Informe o tamanho em polegadas da TV:");
            int polegadas = scanner.nextInt();
            eletrodomestico = new TV(marca, modelo, preco, polegadas);
        }

        if (eletrodomestico != null) {
            System.out.println("Marca: " + eletrodomestico.getMarca());
            System.out.println("Modelo: " + eletrodomestico.getModelo());
            System.out.println("Preço: R$ " + eletrodomestico.getPreco());
            System.out.println("Garantia estendida: R$ " + eletrodomestico.calcularGarantiaEstendida());
        } else {
            System.out.println("Opção inválida.");
        }
    }
}