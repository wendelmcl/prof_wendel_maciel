package carro;

public class Carro{
    private String marca;
    private int fabricacao;
    private double preco;
    private double velocidade;
    
    public void imprimir_dados(){
        System.out.println("\nMarca: " + marca +"\nFabricação: " + fabricacao + "\nPreço: " + preco + "\nVelocidade: "+velocidade);
    }
    
    public double acelerar(){
        velocidade = velocidade + 50.0;
        return velocidade;
    }
    public double frear(){
    	if(velocidade < 0) {
    		velocidade = 0;
    	}else {
    		velocidade = velocidade - 30;
    	}
    	return velocidade;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(int fabricacao) {
		this.fabricacao = fabricacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
}