package q2;

import java.util.Scanner;

public class execucao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		String texto = Integer.toString(num);
		 
		for (int j = 0; j < texto.length(); j++) {
			if(texto.charAt(j) == 'a' || texto.charAt(j) == 'A') {
				 a++;
						
			} 
			if(texto.charAt(j) == 'e' || texto.charAt(j) == 'E') {
				e++;
						
			}
			if(texto.charAt(j) == 'i' || texto.charAt(j) == 'I') {
				i++;
						
			}
			if(texto.charAt(j) == 'o' || texto.charAt(j) == 'O') {
				o++;
						
			}
			if(texto.charAt(j) == 'u' || texto.charAt(j) == 'U') {
				u++;
						
			}
		}
		
		int soma = a + e + i + o + u;
		System.out.println("A soma do numero é: " + soma);
	}
}
