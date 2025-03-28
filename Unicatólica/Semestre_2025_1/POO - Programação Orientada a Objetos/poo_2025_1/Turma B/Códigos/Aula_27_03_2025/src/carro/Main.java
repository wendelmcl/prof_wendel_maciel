package carro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a marca: ");
		c1.setMarca(sc.nextLine());
		System.out.println("Digite o ano de fabricação: ");
		c1.setFabricacao(sc.nextInt());
		System.out.println("Digite o preço: ");
		c1.setPreco(sc.nextDouble());
		System.out.println("Digite a velocidade: ");
		c1.setVelocidade(sc.nextDouble());
		c1.imprimir_dados();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		System.out.println("Velocidade atualizada: "+c1.getVelocidade());
	}
}