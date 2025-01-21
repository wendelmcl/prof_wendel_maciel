package q2;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		c1.setRaio(sc.nextDouble());
		
		double calcularArea = c1.calcularArea();
		double calcularPerimetro = c1.calcularPerimetro();
		
		System.out.println("Área: " + calcularArea);
		System.out.println("Perímetro: " + calcularPerimetro);
		
	}
}
