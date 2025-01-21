package q2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra ");
		String palavra = sc.next();
		int contador = contarVogais(palavra);
		
		System.out.println("A palavra \"" + palavra + "\" tem " + contador + " vogais. ");
	
	}
	public static int contarVogais(String palavras){
		int contador = 0;
		String palavra = palavras.toLowerCase();
		
		for (int i = 0; i < palavra.length(); i++){
			char letra = palavra.charAt(i);
			if (letra == 'a' ||letra == 'e' || letra == 'i' || letra == 'o' || letra =='u'){
				contador++;
			}
		}
		return contador;
	}
}
