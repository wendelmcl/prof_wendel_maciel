//Vetores 05 numeros.
package Prova;
import java.util.Scanner;
public class QuestaoDois {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
int  vetor[] = {4,7,20,23,11};
int soma= 0;
for(int i=0;i<vetor.length;i++) {
	System.out.println("Vetor:["+i+"]:"+vetor[i]);
	soma= soma + vetor[i];
	
	}
System.out.println("\nSoma:"+soma);
}
}
