package revisao5;

public class Execucao {

	public static void main(String[] args) {
		Exemplo5 ex = new Exemplo5();
		
		System.out.println("Int: "+ex.soma(50, 100));
		System.out.println("Double: "+ex.soma(80.0, 50.0));
		System.out.println("String: "+ex.soma("Olá", "Mundo!"));
	}

}
