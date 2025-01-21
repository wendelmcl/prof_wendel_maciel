package q1;

public class Main {
	public static void main(String[] args) {
   
		Alimento pizza = new Alimento("96439742", "Pizza", 1.5);

		System.out.println("Código do produto: " + pizza.getCodigo());
		System.out.println("Descrição do produto: " + pizza.getDescricao());
		System.out.println("Valor do frete: R$" + pizza.calcularFrete());
 	
 	}

}
