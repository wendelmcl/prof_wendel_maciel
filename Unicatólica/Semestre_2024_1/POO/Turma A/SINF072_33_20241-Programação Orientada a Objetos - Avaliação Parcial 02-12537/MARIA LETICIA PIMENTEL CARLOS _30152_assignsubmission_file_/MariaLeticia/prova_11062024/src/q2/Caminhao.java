package q2;

public class Caminhao implements Veiculo{

	@Override
	public void acelerar() {
		System.out.println("O caminhao est� acelerando...");
		
	}

	@Override
	public void frear() {
System.out.println("O caminhao est� freando");		
	}

	@Override
	public void barulho() {
System.out.println("O caminhao est� fazendo Barulho...");		
	}

}
