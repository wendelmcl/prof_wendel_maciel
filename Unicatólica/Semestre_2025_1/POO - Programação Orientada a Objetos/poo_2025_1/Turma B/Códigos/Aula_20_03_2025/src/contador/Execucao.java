package contador;
import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Contador c1 = new Contador();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		c1.valor = sc.nextInt();
		System.out.println("Valor: " + c1.valor);
		c1.zerar();
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		System.out.println("Valor: " + c1.retornar());
		

	}
}
