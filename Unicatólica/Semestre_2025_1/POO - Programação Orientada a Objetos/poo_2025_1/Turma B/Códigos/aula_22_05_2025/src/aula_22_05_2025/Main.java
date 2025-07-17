package aula_22_05_2025;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Diretor("Ana", 10000, 1000);
		Funcionario f2 = new Gerente("Carlos", 100, 200);
		double resultado = 0.0;
		System.out.println("Salário Diretor: R$ "+f1.calcularSalario());
		resultado = f2.calcularSalario();
		System.out.println("Salário Gerente: R$ "+resultado);
	}
}
