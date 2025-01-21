package q1;

public abstract class Produto {
	protected String codigo;
	protected String descricao;

	 public Produto(String codigo, String descricao) {
	     this.codigo = codigo;
	     this.descricao = descricao;
	 }

	 public abstract String getCodigo();
	 public abstract String getDescricao();
	 
}

