package revisao3;

public class Exemplo3 {
	public static void main(String[] args) {
		int vetor[] = {8,9,4,5,7,3,10};
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor["+i+"]: "+vetor[i]);
			soma = soma + vetor[i];
		}
		System.out.println("\nSoma: "+soma);
	}
}
