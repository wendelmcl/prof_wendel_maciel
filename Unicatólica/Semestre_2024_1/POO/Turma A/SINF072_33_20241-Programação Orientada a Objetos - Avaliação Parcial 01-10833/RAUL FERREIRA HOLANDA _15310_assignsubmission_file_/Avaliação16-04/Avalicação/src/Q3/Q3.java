package Q3;

import java.util.Scanner;


	public class Q3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] n = new int[10];
	        
	        System.out.println("Digite 10 numeros inteiros:");
	        for (int i = 0; i < n.length; i++) {
	            System.out.print("Numero " + (i + 1) + ": ");
	            n[i] = sc.nextInt();
	        }
	        int pares = 0;
	        int impares = 0;
	        for (int numero : n) {
	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }
	        System.out.println("Quantos são pares: " + pares);
	        System.out.println("Quantos são impares: " + impares);
	        
	        sc.close();
	}
	}

