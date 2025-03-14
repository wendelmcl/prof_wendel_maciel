package projeto_calculadora;
import java.util.Scanner;
public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora c1 = new Calculadora();
		System.out.println("N1: ");
		c1.n1 = sc.nextDouble();
		System.out.println("N2: ");
		c1.n2 = sc.nextDouble();
		System.out.println("Digite o operador: ");
		c1.operador = sc.next();
		
		c1.imprimir_dados();
		
		if(c1.operador.equals("+")) {
			System.out.println("Soma: " + c1.somar());
		}else if(c1.operador.equals("-")) {
			System.out.println("Subtração: " + c1.subtrair());
		}else if(c1.operador.equals("*")){
			System.out.println("Multiplicação: " + c1.multiplicar());
		}else if(c1.operador.equals("/")) {
			System.out.println("Divisão: " + c1.dividir());
		}else {
			System.out.println("Operador inválido...");
		}
	}
}
