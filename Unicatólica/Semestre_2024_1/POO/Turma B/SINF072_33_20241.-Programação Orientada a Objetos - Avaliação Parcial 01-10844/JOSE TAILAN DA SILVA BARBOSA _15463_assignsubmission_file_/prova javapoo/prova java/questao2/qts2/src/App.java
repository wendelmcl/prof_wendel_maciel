

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palavra;
        int qtdVogais = 0;
        System.out.println("Digite uma palavra: ");
        palavra = sc.next();
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                qtdVogais++;
            }
        }
        System.out.println("A quantidade de vogais na palavra e: " + qtdVogais);
    }
}