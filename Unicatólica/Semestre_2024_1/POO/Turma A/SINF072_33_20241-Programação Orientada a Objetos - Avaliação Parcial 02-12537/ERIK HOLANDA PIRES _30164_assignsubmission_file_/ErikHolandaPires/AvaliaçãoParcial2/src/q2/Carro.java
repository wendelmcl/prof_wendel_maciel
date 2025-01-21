package q2;

public class Carro implements Veiculo{

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("O carro está acelerando!");
	}

	@Override
	public void frear() {
		System.out.println("O carro está freando!");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O carro está fazendo barulho!");
		
	}
	
}
