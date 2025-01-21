	package q2;
	
import java.util.Scanner;
	public class Questao2 {
	
	public static void main(String[] args) {
			  Scanner scanner = new Scanner(System.in);
			  System.out.println("Digite uma palavra:");
			  String palavra = scanner.nextLine().toLowerCase();
			  int contador = 0;

			  for (int i = 0; i < palavra.length(); i++) {
			  char letra = palavra.charAt(i);
			  if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			     contador++;
			    }
			 }

			   System.out.println("A quantidade de vogais na palavra é: " + contador);
			    }
			}
			
	


