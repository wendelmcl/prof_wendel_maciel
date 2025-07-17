package heranca;

public class Veiculo {
	
	private String modelo;
	private int ano;
	
	public Veiculo(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirDetalhes() {
		System.out.println("Modelo: "+modelo+""
				+ "\nAno: "+ano);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
