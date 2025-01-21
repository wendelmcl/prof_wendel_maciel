package q4;

import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cliente c1 = new Cliente();
		System.out.println("Você Deseja Cadastrar um novo Cliente? ( | s | Para sim  e | n | para não )");
		String cad = sc.next();

		while(cad.equals("s")) {
	
			System.out.println("Digite o nome do Cliente: ");
			c1.setNome(sc.next());
			System.out.println("Digite a Idade: ");
			c1.setIdade(sc.nextInt());
			System.out.println("Digite o email: ");
			c1.setEmail(sc.next());
			
			
			System.out.println("Você Deseja Cadastrar um novo Cliente? ( | s | Para sim  e | n | para não )");
			cad = sc.next();
			
		}
		
		System.out.println("cliente cadastrado com Sucesso");
		System.out.println("Nome: "+ c1.getNome());
		System.out.println("Idade: "+ c1.getIdade());
		System.out.println("Email: "+ c1.getEmail());

		
	}

}
