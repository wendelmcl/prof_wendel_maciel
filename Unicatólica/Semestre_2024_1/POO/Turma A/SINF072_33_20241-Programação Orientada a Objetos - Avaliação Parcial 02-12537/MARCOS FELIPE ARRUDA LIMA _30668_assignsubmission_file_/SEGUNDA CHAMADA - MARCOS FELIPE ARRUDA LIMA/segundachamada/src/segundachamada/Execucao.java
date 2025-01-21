package segundachamada;
import java.util.Scanner;
public class Execucao {
	public static void main(String[] args) {
		Geladeira geladeira = new Geladeira("Consul", "Freezer", 5.000);
		Tv tv = new Tv("Samsung","Smart TV", 1.500);
		
		System.out.println("Valor da garantia da Geladeira: "+geladeira.calcularGarantiaEstendida());
		System.out.println("Valor da garantia da TV: "+tv.calcularGarantiaEstendida());
	}	
}
