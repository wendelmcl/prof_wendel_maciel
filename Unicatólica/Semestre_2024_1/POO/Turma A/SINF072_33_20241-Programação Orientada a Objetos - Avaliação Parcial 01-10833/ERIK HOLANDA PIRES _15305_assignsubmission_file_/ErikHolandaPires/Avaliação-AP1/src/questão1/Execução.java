package quest�o1;
import java.util.Scanner;

public class Execu��o {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Intpos pri = new Intpos();
		
		System.out.println("Digite o n�mero: ");
		pri.setN1(sc.nextInt());;
		
		if(pri.getN1() / pri.getN1() == 1 && pri.getN1() / pri.getN1() == pri.getN1() ){
			System.out.println("O n�mero digitado � primo!");
		}else{
			System.out.println("O n�mero digitado n�o � primo!");
		}
		
	}

}
