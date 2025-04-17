package pessoa;
import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		p1.nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		p1.idade = sc.nextInt();
		System.out.println("Digite seu CPF: ");
		p1.cpf = sc.next();
		
		p1.imprimir_dados();
		
	}
}
