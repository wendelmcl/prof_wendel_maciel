package q2;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5] ;
		
		System.out.println("Digite o primeiro n�mero do vetor: ");
		 num[0] = sc.nextInt();
		System.out.println("Digite o segundo n�mero do vetor:");
		 num[1] = sc.nextInt();
		System.out.println("Digite o terceiro n�mero do vetor: ");
		 num[2] = sc.nextInt();
		System.out.println("Digite o quarto n�mero do vetor: ");
		 num[3] = sc.nextInt();
		System.out.println("Digite o quinto n�mero do vetor: ");
		 num[4] = sc.nextInt();
		 
		int soma = 0;
		for (int i = 0; i <= 4 ; i++ ){
			soma += num[i];
		} 
		
		System.out.println("A soma dos n�meros digitados � igual a : " + soma);
		 sc.close();
	}

}
