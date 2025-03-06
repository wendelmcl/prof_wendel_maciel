package exemplo_while;
import java.util.Scanner;
public class Exemplo2_While {

	public static void main(String[] args) {
		int num = 0, i = 1, qtd_numeros = 0, somatorio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de números: ");
		qtd_numeros = sc.nextInt();
		while(i <= qtd_numeros) {
			System.out.println("Números: ");
			num = sc.nextInt();
			somatorio = somatorio + num;
			i++;
		}
		System.out.println("Somatório: " + somatorio);
	}
}
