package quest�o2;
import java.util.Scanner;
public class Execu��o {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 n�meros");
		
		int[] vet = new int[5];
		int soma = 0;
		
		for(int i = 0; i < vet.length; i++){
		  vet[i] = sc.nextInt();
		  soma += vet[i];
		} 
		System.out.println(soma);
		
		
	}

}
