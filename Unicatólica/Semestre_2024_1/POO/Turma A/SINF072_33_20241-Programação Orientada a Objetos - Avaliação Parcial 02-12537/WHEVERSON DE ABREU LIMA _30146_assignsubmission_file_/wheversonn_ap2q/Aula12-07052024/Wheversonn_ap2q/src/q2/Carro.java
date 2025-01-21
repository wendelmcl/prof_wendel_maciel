package q2;

public class Carro implements Veiculo {

	@Override
	public void acelerar() {
System.out.println("O carro esta acelerando...");		
	}

	@Override
	public void frear() {
System.out.println("O carro esta freando...");		
	}

	@Override
	public void barulho() {
System.out.println("O carro esta fazendo barulho...");		
	}

}
