package exemplo2;

public class Execucao {

	public static void main(String[] args) {
		Adulto a1 = new Adulto();
		a1.setNome("Maria");	
		a1.setIdade(30);
		a1.mostrarInformações();
		System.out.println("Idade incrementada: "+a1.incrementarIdade());
	}
}
