package aula_13_02_2025;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		double F = 0.0, C = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		F = sc.nextDouble();
		C = 5 * ((F - 32) / 9);
		System.out.println("Fahrenheit: " + F);
		System.out.println("Celsius: " + C);

	}

}
