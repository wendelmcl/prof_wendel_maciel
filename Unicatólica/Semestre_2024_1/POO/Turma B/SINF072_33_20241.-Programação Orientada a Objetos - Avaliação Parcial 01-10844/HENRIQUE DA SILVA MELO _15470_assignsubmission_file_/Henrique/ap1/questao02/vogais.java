
public class vogais {
	public static void main(String[] args) {
		
		java.util.Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Digite uma palavra: ");
		 String palavra = scanner.nextLine()
				 
		 int contadorVogais = 0;
		 
		 for(int i = 0; i < palavra.length(); i++) {
			 char caractere = palavra.charAt(i);
			 
			if (caractere == 'a' // caractere == 'e' // caractere == 'i' // caractere == '0' // caractere == 'u') {
			   ContadorVogais++
		 }
	}
	      System.out.println("A palavra '" + palavra + "'possui" + contadorVogais + " vogais.");
	      
	      scanner.close();
		 
	}
}
