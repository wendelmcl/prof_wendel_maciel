package aula_08_05_2025;
import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diretor d1 = new Diretor();
		Gerente g1 = new Gerente();
		int opcao = 0;
		do {
			System.out.println("Digite uma opção: "+""
					+ "\n1 - Diretor: "+""
					+ "\n2 - Gerente: "+""
					+ "\n3 - Sair");
			opcao = sc.nextInt();
			if(opcao == 1) {
				System.out.println("###DIRETOR###");
				System.out.println("Nome: ");
				d1.setNome(sc.next());
				System.out.println("CPF: ");
				d1.setCpf(sc.next());
				System.out.println("Idade: ");
				d1.setIdade(sc.nextInt());
				System.out.println("Salário: ");
				d1.setSalario(sc.nextDouble());
				System.out.println("Cargo: ");
				d1.setCargo(sc.next());
				System.out.println("Bonificação: ");
				d1.setBonificacao(sc.nextDouble());
				d1.exibir_dados();
				System.out.println("Salário+Bonificação: "+d1.calcular_salario());
			}else if(opcao == 2) {
				System.out.println("###GERENTE###");
				System.out.println("Nome: ");
				g1.setNome(sc.next());
				System.out.println("CPF: ");
				g1.setCpf(sc.next());
				System.out.println("Idade: ");
				g1.setIdade(sc.nextInt());
				System.out.println("Salário: ");
				g1.setSalario(sc.nextDouble());
				System.out.println("Cargo: ");
				g1.setCargo(sc.next());
				System.out.println("Bonificação: ");
				g1.setBonificacao(sc.nextDouble());
				g1.exibir_dados();
				System.out.println("Salário+Bonificação: "+g1.calcular_salario());
			}
			
		}while(opcao < 3);
		System.out.println("Saindo do sistema...");
	}
}
