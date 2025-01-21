package Avaliação2;

public class Execução {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c = new Carro();
		Motocicleta m = new Motocicleta();
		Caminhao ca = new Caminhao();
		Crud cru = new Crud();
		
		cru.loop(c);
	}

}
