package laco_de_repeticao;

public class For_2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("\n");
		for(int i = 2; i <= 20; i = i + 2) {
			System.out.println("Pares: " + i);
		}
		System.out.println("\n");
		for(int i = 1; i <= 20; i = i + 2) {
			System.out.println("Ímpares: " + i);
		}
	}
}
