package q3;
import java.util.Arrays;
import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		System.out.println(" Digite cinco números um de cada vez: ");
		for (int i = 0; i < 5; i++){
			numeros[i] = sc.nextInt();
		}
		Arrays.sort(numeros);
		System.out.println("Numeros em ordem crescente: ");
		for (int numero : numeros){
			System.out.print(numero + " ");
		}
	}

}
