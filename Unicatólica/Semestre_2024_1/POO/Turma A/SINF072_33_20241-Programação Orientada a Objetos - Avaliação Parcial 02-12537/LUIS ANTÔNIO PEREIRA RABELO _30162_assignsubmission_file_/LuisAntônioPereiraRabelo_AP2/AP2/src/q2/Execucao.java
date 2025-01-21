package q2;

public class Execucao {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Motocicleta m1 = new Motocicleta();
		Caminhao ca1 = new Caminhao();
		Array a1 = new Array();
		
		c1.setId(1);
		m1.setId(1);
		ca1.setId(1);
		
		c1.acelerar();
		c1.frear();
		c1.barulho();
		m1.acelerar();
		m1.frear();
		m1.barulho();
		ca1.acelerar();
		ca1.frear();
		ca1.barulho();
	}

}
