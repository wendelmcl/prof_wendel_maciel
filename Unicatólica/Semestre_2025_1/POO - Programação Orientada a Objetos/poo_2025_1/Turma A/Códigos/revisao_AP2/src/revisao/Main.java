package revisao;

public class Main {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Ana", "1", 10000.0);
		Estagiario e1 = new Estagiario("Carlos", "2", 2000.0);
		
		System.out.println("---GERENTE---");
		System.out.println("\nNome: "+g1.getNome()+""
				+ "\nMatrícula: "+g1.getMatricula()+""
				+ "\nSalário base: "+g1.getSalarioBase());
		System.out.println("\nBônus: "+g1.calcularBonus());
		
		System.out.println("\n---ESTAGIÁRIO---");
		System.out.println("\nNome: "+e1.getNome()+""
				+ "\nMatrícula: "+e1.getMatricula()+""
				+ "\nSalário base: "+e1.getSalarioBase());
		System.out.println("\nBônus: "+e1.calcularBonus());
		
	}
}
