package q2;

public class Carro implements Veiculo{

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("O carro est� acelerando!");
	}

	@Override
	public void frear() {
		System.out.println("O carro est� freando!");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O carro est� fazendo barulho!");
		
	}
	
}
