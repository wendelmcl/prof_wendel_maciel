// Classe principal
public class Main {
	public static void main(String[] args) {
		Geladeira geladeira = new Geladeira("Samsung"; "RT38K553258", 2500.00, 380);
		Tv tv = new Tv("LG", "OLED55C1", 4500.00, 55);
		
		System.out.println("Geladeira " + geladeira.getMarca() + " " + geladeira.getModelo() +
				           " - Garantia Estendida: R$ + geladeira.calcularGarantiaEstendida());"
				           
		System.out.println("TV " + tv.getMarca() + " " + tv.getModelo() +
				           " - Garantia Estendida: R$" + tv.calcularGarantiaEstendida());
	}
}


