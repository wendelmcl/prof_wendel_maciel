package q2;

public class Caminhao implements Veiculo{

	@Override
	public void acelerar() {
		System.out.println("O caminhao está acelerando...");
		
	}

	@Override
	public void frear() {
System.out.println("O caminhao está freando");		
	}

	@Override
	public void barulho() {
System.out.println("O caminhao está fazendo Barulho...");		
	}

}
