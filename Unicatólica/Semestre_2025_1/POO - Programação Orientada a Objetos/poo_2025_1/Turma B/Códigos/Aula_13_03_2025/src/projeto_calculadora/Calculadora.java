package projeto_calculadora;

public class Calculadora {
	double n1;
	double n2;
	double resultado;
	String operador;
	
	public void imprimir_dados() {
		System.out.println("N1: " + n1 + "\nN2: " + n2
				+ "\nOperador: " + operador);
	}
	
	public double somar() {
		resultado = n1 + n2;
		return resultado;
	}
	public double subtrair() {
		resultado = n1 - n2;
		return resultado;
	}
	public double multiplicar() {
		resultado = n1 * n2;
		return resultado;
	}
	
	public double dividir() {
		resultado = n1 / n2;
		return resultado;
	}
}
