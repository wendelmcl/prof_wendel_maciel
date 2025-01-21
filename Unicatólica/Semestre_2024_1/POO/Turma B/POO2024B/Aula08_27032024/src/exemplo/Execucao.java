package exemplo;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();
		Scanner sc = new Scanner(System.in);
		System.out.println("#######ALUNO#######");
		System.out.println("Nome: ");
		a1.setNome(sc.next());
		System.out.println("Idade: ");
		a1.setIdade(sc.nextInt());
		System.out.println("CPF: ");
		a1.setCpf(sc.next());
		System.out.println("Matrícula: ");
		a1.setMatricula(sc.nextInt());
		System.out.println("Nota: ");
		a1.setNota(sc.nextDouble());
		
		System.out.println("#######ALUNO#######");
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Idade: " + a1.getIdade());
		System.out.println("CPF: " + a1.getCpf());
		System.out.println("Matrícula: " + a1.getMatricula());
		System.out.println("Nota: "+a1.getNota());
		
		System.out.println("#######PROFESSOR#######");
		System.out.println("Nome: ");
		p1.setNome(sc.next());
		System.out.println("Idade: ");
		p1.setIdade(sc.nextInt());
		System.out.println("CPF: ");
		p1.setCpf(sc.next());
		System.out.println("Carga Horária: ");
		p1.setCargaHoraria(sc.nextInt());
		System.out.println("Disciplina: ");
		p1.setDisciplina(sc.next());
		
		System.out.println("#######PROFESSOR#######");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("CPF: " + p1.getCpf());
		System.out.println("Carga Horária: "+p1.getCargaHoraria());
		System.out.println("Disciplina: "+p1.getDisciplina());
	}
}
