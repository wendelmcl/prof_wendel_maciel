package exemplo2;

import java.util.Scanner;

public class Execucao {
	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		Retangulo r1 = new Retangulo();
		Triangulo t1 = new Triangulo();
		Circulo c1 = new Circulo();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("##########QUADRADO##########");
		System.out.println("Base: ");
		q1.setLargura(sc.nextDouble());
		System.out.println("Área do Quadrado: "+q1.calcularArea(q1.getLargura()));
		System.out.println("\n");
		
		System.out.println("##########RETÂNGULO##########");
		System.out.println("Base: ");
		r1.setLargura(sc.nextDouble());
		System.out.println("Altura: ");
		r1.setAltura(sc.nextDouble());
		System.out.println("Área do Retângulo: "+r1.calcularArea(r1.getLargura(), r1.getAltura()));
		System.out.println("\n");
		
		System.out.println("##########TRIÂNGULO##########");
		System.out.println("Base: ");
		t1.setLargura(sc.nextDouble());
		System.out.println("Altura: ");
		t1.setAltura(sc.nextDouble());
		System.out.println("Área do Triângulo: "+t1.calcularArea(r1.getLargura(), r1.getAltura()));
		System.out.println("\n");
		
		System.out.println("##########CÍRCULO##########");
		System.out.println("Raio: ");
		c1.setRaio(sc.nextDouble());
		System.out.println("Área do Círculo: "+c1.calcularArea());
		System.out.println("\n");
	}
}
