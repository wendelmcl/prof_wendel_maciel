package aula_13_02_2025;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		double C = 0.0, F = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		C = sc.nextDouble();
		F = (C * 1.8) + 32;
		System.out.println("Celsius: " + C);
		System.out.println("Fahrenheit: " + F);

	}

}
