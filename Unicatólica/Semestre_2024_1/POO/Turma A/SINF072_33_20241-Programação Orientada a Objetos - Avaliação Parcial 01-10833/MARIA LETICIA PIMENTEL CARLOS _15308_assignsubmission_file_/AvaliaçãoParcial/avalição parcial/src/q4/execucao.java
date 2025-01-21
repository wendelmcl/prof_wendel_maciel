package q4;


public class execucao {

	public static void main(String[] args) {
	
	Banco bc = new Banco();
	
	bc.setNumeroConta(2023010522);
	bc.setSaldo(2000);
	
	System.out.println("NÚMERO DA CONTA : "+ bc.getNumeroConta());
	bc.consulta();
	
	bc.saque(500);
	bc.depositar(100.50);
	bc.consulta();
	
	

	
	
	
	}

}
