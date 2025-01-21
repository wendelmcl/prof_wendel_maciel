package q3;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Livro l1 = new Livro();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Título: ");
		l1.setTitulo(sc.next());
		System.out.println("Digite o nome do Autor: ");
		l1.setAutor(sc.next());
		System.out.println("Digite a quantidade de páginas");
		l1.setNumPaginas(sc.nextInt());
		
		l1.imprimirInformacoes();
		
	}

}
