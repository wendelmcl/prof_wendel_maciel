
public class vetor {

}         public static void main(String[] args) {
	      
	    java.util.Scanner scanner = new Scanner(System.in);
	    
	    int tamanhoVetor = 5;
	
	int[] numeros = new int[tamanhoVetor];
	
	System.out.println("Digite 5 números inteiros: ");
	for (int i = 0; i < tamanhoVetor; i++) {
		System.out.println("Numero " + (i + 1)+ ": ");
		numeros[i] = scanner.nextInt();
}
