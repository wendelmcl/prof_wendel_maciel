package q2;

public class Motocileta implements Veiculo {

	@Override
	public void acelerar() {
System.out.println("A motocicleta está acelerando...");		
	}

	@Override
	public void frear() {
System.out.println("A motocicleta esta freando...");		
	}

	@Override
	public void barulho() {
System.out.println("A motocicleta esta fazendo barulho...");		
	}

}
