package contaBanco;

import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		p1.setNome("Felipe");
		p1.setNconta(28402282);
		System.out.println("Nome: "+ p1.getNome());
		System.out.println("Numero da conta: " + p1.getNconta());
	}

}
