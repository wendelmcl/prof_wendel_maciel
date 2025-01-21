package q3;
import java.util.Scanner;
public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[10];
		int par = 0;
		int impar = 0;
		for(int i = 0; i < vetor.length; i++){
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
			if(vetor[i]%2 == 0){
				par++;
			}else{
				impar++;
			}
		}
		System.out.println("Pares: " + par);
		System.out.println("Impares: " + impar);
		sc.close();
	}
}