package q1;

public class Alimento extends Produto implements Entregavel  {
	
	private String Codigo;
	private String Descricao;
	private double Peso;
	
	
	
	
	
	
	public Alimento(String codigo, String descricao, double peso) {
		super();
		Codigo = codigo;
		Descricao = descricao;
		Peso = peso;
	}



	public double getPeso() {
		return Peso;
	}



	@Override
	public double CalcularFrete() {
		// TODO Auto-generated method stub
		return 5;
	}



	@Override
	String Getcodigo() {
		// TODO Auto-generated method stub
		return Codigo;
	}



	@Override
	String GetDescricao() {
		// TODO Auto-generated method stub
		return Descricao;
	}

	
	
}
