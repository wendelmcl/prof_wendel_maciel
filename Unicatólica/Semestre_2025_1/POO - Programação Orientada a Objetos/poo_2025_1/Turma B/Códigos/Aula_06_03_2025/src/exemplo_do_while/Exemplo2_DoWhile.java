package exemplo_do_while;
import java.util.Scanner;
public class Exemplo2_DoWhile {

	public static void main(String[] args) {
		int num = 0, i = 1, qtd_numeros = 0, somatorio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de números: ");
		qtd_numeros = sc.nextInt();
		do {
			System.out.println("Número: ");
			num = sc.nextInt();
			somatorio = somatorio + num;
			i++;
		}while(i <= qtd_numeros);
		System.out.println("Somatório: " + somatorio);
	}
}
