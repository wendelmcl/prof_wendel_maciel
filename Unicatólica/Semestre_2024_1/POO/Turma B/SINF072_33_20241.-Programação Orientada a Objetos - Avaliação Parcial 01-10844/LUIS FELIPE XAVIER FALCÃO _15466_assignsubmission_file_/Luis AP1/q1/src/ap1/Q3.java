package ap1;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int v[] = new int[5];
		
		System.out.print("Digite cinco n�meros: ");
		for (int c = 0; c < 5; c++){
			v[c] = tec.nextInt();
		}
		
		Arrays.sort(v);
		System.out.println("Os numeros que voc� digitou em ordem crescente s�o: ");
		for (int n : v){
			System.out.print(n + " ");
		}
		
		
	}
	

}
