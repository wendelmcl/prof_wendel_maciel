package q3;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		System.out.println("A seguir, digite 10 números inteiros positivos: ");
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();
		num[5] = sc.nextInt();
		num[6] = sc.nextInt();
		num[7] = sc.nextInt();
		num[8] = sc.nextInt();
		num[9] = sc.nextInt();
		int somaP = 0;
		int somaI = 0;
		for (int i = 0; i <= 9; i++){
		if (num[i] % 2 == 0){
			somaP = somaP + 1;
		} else {
			somaI = somaI + 1;
		}
		}
		System.out.println("Total de números PARES: " + somaP);
		System.out.println("Total de números IMPARES:" + somaI);
		sc.close();
	}

}
