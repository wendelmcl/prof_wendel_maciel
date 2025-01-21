package questão1;
import java.util.Scanner;

public class Execução {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Intpos pri = new Intpos();
		
		System.out.println("Digite o número: ");
		pri.setN1(sc.nextInt());;
		
		if(pri.getN1() / pri.getN1() == 1 && pri.getN1() / pri.getN1() == pri.getN1() ){
			System.out.println("O número digitado é primo!");
		}else{
			System.out.println("O número digitado não é primo!");
		}
		
	}

}
