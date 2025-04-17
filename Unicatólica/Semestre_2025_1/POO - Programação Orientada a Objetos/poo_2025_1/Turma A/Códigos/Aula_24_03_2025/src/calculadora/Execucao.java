package calculadora;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		Scanner sc = new Scanner(System.in);
		String opcao = "";
		System.out.println("Digite N1: ");
		c1.n1 = sc.nextDouble();
		System.out.println("Digite N2: ");
		c1.n2 = sc.nextDouble();
		System.out.println("Digite uma opção: "
				+ "\n+ = Somar"
				+ "\n- = Subtrair"
				+ "\n* = Multiplicar"
				+ "\n/ = Dividir");
		opcao = sc.next();
		c1.imprimir_dados();
		System.out.println("Opção: "+opcao);
		if(opcao.equals("+")) {
			System.out.println("Soma: "+c1.somar());
		}else if(opcao.equals("-")) {
			System.out.println("Subtração: "+c1.subtrair());
		}else if(opcao.equals("*")) {
			System.out.println("Multiplicação: "+c1.multiplicar());
		}else if(opcao.equals("/")) {
			System.out.println("Divisão: "+c1.dividir());
		}else {
			System.out.println("Operador inválido...");
		}
	}
}
