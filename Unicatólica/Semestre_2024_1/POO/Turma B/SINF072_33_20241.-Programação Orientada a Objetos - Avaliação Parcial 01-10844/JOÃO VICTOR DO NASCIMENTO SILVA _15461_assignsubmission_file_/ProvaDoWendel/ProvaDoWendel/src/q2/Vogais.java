package q2;

import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = 0;

        System.out.println("Digite a palavra: ");
        String palavra = input.nextLine();

    
        for (int i = 0; i < palavra.length(); i++) {
        
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u' ||
                    palavra.charAt(i) == 'A' || palavra.charAt(i) == 'E' || palavra.charAt(i) == 'I' || palavra.charAt(i) == 'O' || palavra.charAt(i) == 'U') {
           
                entrada++;
            }
        }

       
        System.out.println("A palavra " + palavra + " tem " + entrada + " vogais.");
    }
}
        
        
    

