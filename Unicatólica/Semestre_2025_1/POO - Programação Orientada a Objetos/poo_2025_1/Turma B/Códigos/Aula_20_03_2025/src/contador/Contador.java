package contador;

public class Contador {
	int valor;
	
	public void zerar() {
		valor = 0;
		System.out.println("Valor: " + valor);
	}
	
	public void incrementar() {
		valor = valor + 1;
		System.out.println("Valor: " + valor);
	}
	
	public int retornar() {
		return valor;
	}
}
