package q1;
import java.util.Scanner;
public class numeros_primos {
//next  //&& ///%
	public  static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("digite um numero inteiro e positivo");
	int numdigitado = scanner.nextInt();
	boolean numeroprimo;
	if (numdigitado <0){
		System.out.println("numero invalido");
		
	}
	if ((numdigitado/numdigitado == 1) && (numdigitado / 1 == numdigitado )){
		
		numeroprimo = true;
	}
	else{
	 numeroprimo = false;
	}
	
	
	if (numeroprimo = true){
			
			System.out.println("o numero digitado e primo");
	}
		if (numeroprimo = false){
			System.out.println("o numero digitado nao e primo");
			
		}
	}
	
}
