package Ap2;

import java.util.Scanner;

public class Execucao {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a marca da geladeira: ");
	        String marcaGeladeira = scanner.nextLine();

	        System.out.print("Digite o modelo da geladeira: ");
	        String modeloGeladeira = scanner.nextLine();

	        System.out.print("Digite o preco da geladeira: ");
	        double precoGeladeira = scanner.nextDouble();
	        scanner.nextLine();

	        Geladeira geladeira = new Geladeira(marcaGeladeira, modeloGeladeira, precoGeladeira);

	        System.out.print("Digite a marca da TV: ");
	        String marcaTV = scanner.nextLine();

	        System.out.print("Digite o modelo da TV: ");
	        String modeloTV = scanner.nextLine();

	        System.out.print("Digite o preco da TV: ");
	        double precoTV = scanner.nextDouble();
	        scanner.nextLine();

	        TV tv = new TV(marcaTV, modeloTV, precoTV);

	        System.out.println("Geladeira:");
	        System.out.println("Marca: " + geladeira.getMarca());
	        System.out.println("Modelo: " + geladeira.getModelo());
	        System.out.println("Preco: R$ " + geladeira.getPreco());
	        System.out.println("Garantia Estendida: R$ " + geladeira.calcularGarantiaEstendida());
	        System.out.println();

	        System.out.println("TV:");
	        System.out.println("Marca: " + tv.getMarca());
	        System.out.println("Modelo: " + tv.getModelo());
	        System.out.println("Preco: R$ " + tv.getPreco());
	        System.out.println("Garantia Estendida: R$ " + tv.calcularGarantiaEstendida());
	        
	    }
}

	