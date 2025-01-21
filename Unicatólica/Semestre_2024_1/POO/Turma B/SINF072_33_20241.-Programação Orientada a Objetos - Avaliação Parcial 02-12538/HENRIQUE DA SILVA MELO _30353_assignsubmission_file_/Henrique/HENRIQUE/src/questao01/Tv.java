// Classe concreta Tv
class Tv extends Eletrodomestico {
	private int tamanhoPolegadas;
	
	public Tv(String marca, String modelo, double preco, int tamanhoPolegadas) {
		super(marca, modelo, preco);
		this.tamanhoPolegadas = tamanhoPolegadas;
	}
	
	public double calcularGarantiaEstendida(){
		return preco * 0.15;
	}
	
	public int getTamanhoPolegadas(){
		return tamanhoPolegadas;
	}
}  


public class Tv {

}
