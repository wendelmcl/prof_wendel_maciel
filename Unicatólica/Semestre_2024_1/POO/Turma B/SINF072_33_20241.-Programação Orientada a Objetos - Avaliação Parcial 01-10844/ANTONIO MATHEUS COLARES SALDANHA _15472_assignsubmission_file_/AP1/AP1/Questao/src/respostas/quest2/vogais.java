package respostas.quest2;

import java.util.Scanner;

public class vogais {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String palavra = sc.nextLine();

            int quantidadeVogais = 0;

            for (int i = 0; i < palavra.length(); i++) {
                char letra = palavra.charAt(i);

                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                        letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                    quantidadeVogais++;
                }
            }

            System.out.println("A palavra " + palavra + " contém " + quantidadeVogais + " vogais.");
        }
    }
}
