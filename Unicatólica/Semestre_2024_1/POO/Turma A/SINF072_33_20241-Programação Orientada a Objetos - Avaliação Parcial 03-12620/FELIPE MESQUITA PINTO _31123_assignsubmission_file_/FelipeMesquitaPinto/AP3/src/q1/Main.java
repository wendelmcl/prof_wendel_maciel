package q1;

public class Main {

	
	public static void main(String[] args){
		
		Alimento pizza = new Alimento("123","Pizza De Frango",1.5);
		System.out.println("Codigo : " + pizza.Getcodigo());
		System.out.println("Descricao :" + pizza.GetDescricao());
		System.out.println("Peso : " + pizza.getPeso());
		System.out.println("O frete custa :" + pizza.CalcularFrete() + "R$");


	}
	
	
}
