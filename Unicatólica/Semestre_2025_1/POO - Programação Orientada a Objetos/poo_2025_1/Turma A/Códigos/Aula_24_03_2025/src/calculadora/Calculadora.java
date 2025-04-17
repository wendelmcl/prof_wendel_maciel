package calculadora;

public class Calculadora {
	
	double n1, n2;
	
	public void imprimir_dados() {
		System.out.println("\nN1: " + n1+""
				+ "\nN2: " + n2);
	}
	
	public double somar() {
		return n1 + n2;
	}
	
	public double subtrair() {
		return n1 - n2;
	}
	
	public double multiplicar() {
		return n1 * n2;
	}
	
	public double dividir() {
		return n1 / n2;
	}
}