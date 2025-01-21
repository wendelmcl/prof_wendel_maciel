package questão3;
import java.util.Scanner;

public class Execução {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];
		
		System.out.println("Digite 10 números: ");
		
		for(int i = 0; i < vet.length; i++){
			vet[i] = sc.nextInt(); 
			if(i % 2 == 0){
				System.out.println("PARES" + i);
			}else{
				System.out.println("IMPARES: " + i);
			}
		}
	}
}
