package ap2;

public class produto {
     
	
	protected string codigo;
	protected string descriçao;
	
	public Produto(String codigo,String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	 public abstract String getCodigo();
	 
	 public abstract String getDescricao();
	 
	 public interface Entregavel {
		 
		 double calcularfrete();
	 }
}
