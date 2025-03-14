package projeto_pessoa;

public class Execucao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.nome = "Ana";
		p1.cpf = "088.323.891-00";
		p1.idade = 20;
		
		p1.imprimir_dados();
		p1.estudar();
		p1.correr();
		
		System.out.println("");
		
		p2.nome = "Carlos";
		p2.cpf = "056.420.556-78";
		p2.idade = 19;
		
		p2.imprimir_dados();
		p2.estudar();
		p2.correr();
		
	}
}
