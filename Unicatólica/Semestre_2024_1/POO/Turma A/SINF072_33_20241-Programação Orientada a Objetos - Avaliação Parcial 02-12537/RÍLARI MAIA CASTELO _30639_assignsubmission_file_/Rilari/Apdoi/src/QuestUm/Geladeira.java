package QuestUm;

public class Geladeira {
	String marca;
	String modelo;
	int preco;
    int calculo;
    String garantia;
    
    
	public void geladeiramarca()  {
		System.out.print("A minha marca é: " + this.marca);
	}
	public void geladeiramodelo() {
		System.out.print("O meu modelo é: " + this.modelo);
	}
	public void geladeiraprec()  {
		System.out.print("Meu valor: " + this.preco);
	}
	public void geladeiragarantia(){
		System.out.println("Calculando garantia.." + this.garantia);
	}
		
		
	
}
