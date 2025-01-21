package q2;
import java.util.Scanner;
public class q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra:");
        String vet = scanner.nextLine();
        
        int contagem = 0;
        for (int i = 0; i < vet.length(); i++) {
            char caractere = Character.toLowerCase(vet.charAt(i));
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ) {
                contagem++;
            }
        }
        
        System.out.println("A palavra possui" + contagem + " vogais.");
    }
}
