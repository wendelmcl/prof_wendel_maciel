package q1;

public class Dinheiro extends FormaPagamento{
	private Double total, troco;

	public void imprime(){
		this.troco = this.total - getValor();
		System.out.println("tipo: " + getTipo());
		System.out.println("Valor: "+ getValor());
		System.out.println("Dinheiro recebido: " + this.total);
		System.out.println("Troco: " + this.troco);
		System.out.println("----------------------------");
	}
	
	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getTroco() {
		return troco;
	}

	public void setTroco(Double troco) {
		this.troco = troco;
	}
	
}
