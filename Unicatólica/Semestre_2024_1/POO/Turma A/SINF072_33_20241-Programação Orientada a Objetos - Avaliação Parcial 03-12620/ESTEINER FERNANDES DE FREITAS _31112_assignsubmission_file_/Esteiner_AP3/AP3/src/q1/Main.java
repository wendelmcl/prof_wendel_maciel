package q1;

public class Main {
	public static void main(String[] args) {
   
		Alimento pizza = new Alimento("96439742", "Pizza", 1.5);

		System.out.println("C�digo do produto: " + pizza.getCodigo());
		System.out.println("Descri��o do produto: " + pizza.getDescricao());
		System.out.println("Valor do frete: R$" + pizza.calcularFrete());
 	
 	}

}
