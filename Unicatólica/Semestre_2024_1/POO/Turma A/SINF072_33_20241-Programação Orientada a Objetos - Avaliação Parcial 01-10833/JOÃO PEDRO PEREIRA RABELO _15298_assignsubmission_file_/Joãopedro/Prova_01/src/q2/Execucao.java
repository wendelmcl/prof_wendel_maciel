package q2;

public class Execucao {

	public static void main(String[] args) {
		int vetor[] = {1,2,3,6,4};
		int soma = 0;
		for(int i = 0; i <vetor.length; i++){
			System.out.println("vetor["+i+"]: " + vetor[i]);
			soma = soma +vetor[i];

		}
		System.out.println("soma:"+ soma);
	}
}
