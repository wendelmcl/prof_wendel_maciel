package questão2;
import java.util.Scanner;
public class Execução {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 números");
		
		int[] vet = new int[5];
		int soma = 0;
		
		for(int i = 0; i < vet.length; i++){
		  vet[i] = sc.nextInt();
		  soma += vet[i];
		} 
		System.out.println(soma);
		
		
	}

}
