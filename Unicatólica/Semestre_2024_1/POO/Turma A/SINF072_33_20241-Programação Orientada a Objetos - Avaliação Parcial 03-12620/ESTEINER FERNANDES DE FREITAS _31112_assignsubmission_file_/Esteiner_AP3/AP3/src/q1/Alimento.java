package q1;

public class Alimento extends Produto implements Entregavel {
	private double peso;

	public Alimento(String codigo, String descricao, double peso) {
	   super(codigo, descricao);
	   this.peso = peso;
	}

	@Override
	public String getCodigo() {
	    return super.codigo;
	}

	@Override
	public String getDescricao() {
	    return super.descricao;
	}

	@Override
	public double calcularFrete() {
	    return peso * 0.75;
	}
	
}
