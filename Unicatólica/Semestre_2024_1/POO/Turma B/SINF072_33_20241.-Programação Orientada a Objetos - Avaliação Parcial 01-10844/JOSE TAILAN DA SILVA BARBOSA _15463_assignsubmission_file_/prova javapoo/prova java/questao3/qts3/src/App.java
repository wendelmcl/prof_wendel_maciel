
import java.util.Scanner;
import java.util.Arrays;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("digite 5 numeros :");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("numeros em orden crecente:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}