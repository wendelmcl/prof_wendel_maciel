package sobrecarga;

public class Exemplo_Sobrecarga {
	
	public int soma(int n1, int n2) {
		return n1 + n2;
	}
	
	public String soma(String n1, String n2) {
		return n1 + n2;
	}
	
	public double soma(double n1, double n2) {
		return n1 + n2;
	}
}
