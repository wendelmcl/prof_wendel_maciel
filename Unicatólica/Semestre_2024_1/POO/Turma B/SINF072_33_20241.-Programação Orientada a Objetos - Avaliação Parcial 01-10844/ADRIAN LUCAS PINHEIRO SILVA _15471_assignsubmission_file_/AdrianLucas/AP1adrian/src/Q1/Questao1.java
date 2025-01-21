package Q1;

import java.util.Scanner;

public class Questao1 {

	int numero;

	public static void main(String[] args) {
		
 Scanner sc = new Scanner (System.in);
 System.out.println("digite o numero:");
int num = (sc.nextInt());
 System.out.println("o numero digitado é:" +num);
 System.out.println("digite o primeiro algarismo do seu numero:");
 int primeiro = sc.nextInt();
 System.out.println("digite o segundo algarismo do seu numero:");
 int segundo = sc.nextInt();
 System.out.println("digite o terceiro algarismo do seu numero:");
 int terceiro = sc.nextInt();
 int soma = (primeiro+segundo+terceiro);
 System.out.println("a soma é:"+soma);
	}

}
