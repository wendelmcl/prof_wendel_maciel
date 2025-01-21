package revisao2;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		int vetor[] = {20,15,70,9,8};
		int pesquisa = 0;
		boolean encontrado = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		pesquisa = sc.nextInt();
		for(int i = 0; i < vetor.length; i++) {
			if(pesquisa == vetor[i]) {
				encontrado = true;
				break;
			}
		}
		if(encontrado == true) {
			System.out.println("Valor encontrado");
		}else{
			System.out.println("Valor não encontrado");
		}
	}
}
