// Classe concreta Geladeira
class Geladeira extends Eletrodomestico {
	private int capacidadeLitros;
	
	public Geladeira(String marca, String modelo, double preco, int capacidadeLitros){
		super(marca, modelo, preco);
		this.capacidadeLitros = capacidadeLitros;
	}
	
	public double calcularGarantiaEstendida(){
		return preco * 0.10; // Exemplo: 10% do preço da geladeira
	}
	
	public int getCapacidadeLitros(){
		return capacidadeLitros;
	}
}




