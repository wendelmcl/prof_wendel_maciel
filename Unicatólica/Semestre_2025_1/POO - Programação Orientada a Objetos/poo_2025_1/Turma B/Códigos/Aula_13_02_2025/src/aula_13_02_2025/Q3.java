package aula_13_02_2025;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		double valor_hora = 0.0, qtd_horas = 0.0, salario = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor por hora: ");
		valor_hora = sc.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhados: ");
		qtd_horas = sc.nextDouble();
		salario = valor_hora * qtd_horas;
		System.out.println("Salário: "+salario);
	}
}
