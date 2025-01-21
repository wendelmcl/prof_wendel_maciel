package sobrecarga;

public class Execucao {

	public static void main(String[] args) {
		Exemplo_Sobrecarga es = new Exemplo_Sobrecarga();
		
		System.out.println(es.soma(10, 20));
		System.out.println(es.soma("Ola", "Mundo"));
		System.out.println(es.soma(8.4, 7.9));
	}
}
