package Q1;


	import java.util.Scanner;

	public class Q1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite um n�mero inteiro: ");
	        int n = sc.nextInt();
	        
	        if (n <= 1) {
	            System.out.println("O n�mero n�o � primo.");
	        } else if (P(n)) {
	            System.out.println("O n�mero � primo.");
	        } else {
	            System.out.println("O n�mero n�o � primo.");
	        }
	        
	        sc.close();
	    }
	    public static boolean P(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
