package exemplo1;

public class Execucao {

	public static void main(String[] args) {
		Adulto a1 = new Adulto();
		a1.setNome("Ana");
		a1.setIdade(20);
		
		int resultado = a1.incrementarIdade();
		System.out.println("Nome: "+a1.getNome());
		System.out.println("Idade: "+a1.getIdade());
		System.out.println("Idade Incrementada: "+resultado);
		
	}
}
