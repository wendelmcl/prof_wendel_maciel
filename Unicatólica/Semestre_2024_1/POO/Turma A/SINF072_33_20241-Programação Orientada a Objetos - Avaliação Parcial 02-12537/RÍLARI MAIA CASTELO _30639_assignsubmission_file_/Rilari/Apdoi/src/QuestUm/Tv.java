package QuestUm;

public class Tv {
	String marca;
	String modelo;
	int preco;
    int calculo;
    String garantia;
	
	
	public void tvmarca()  {
		System.out.print("A minha marca é: " + this.marca);
	}
	public void tvmodelo() {
		System.out.print("O meu modelo é: " + this.modelo);
	}
	public void tvprec()  {
		System.out.print("Meu valor: " + this.preco);
	}
	public void tvgarantia(){
		System.out.println("Calculando garantia.." + this.garantia);

}
}
