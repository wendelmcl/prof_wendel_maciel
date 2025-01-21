package Q1;

public class Boleto {
	
	private String codigo;

	public void pagamentoBoleto (double valor){
		System.out.println("Gerando boleto no valor a ser pago de : $" + valor);
		System.out.println("Copia e cola: 113144434335311231553414183nfnfwsj394mksfms233131m193");
		System.out.println("");
		System.out.println("Assim que pago, temos o prazo de ate 24hrs para confirmação do pagamento que será enviada via email!");
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
