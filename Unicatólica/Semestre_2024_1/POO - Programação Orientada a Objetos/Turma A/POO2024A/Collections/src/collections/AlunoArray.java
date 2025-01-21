package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoArray {
	Scanner sc = new Scanner(System.in);
	List<Aluno> alunos = new ArrayList<Aluno>();

	public void cadastrarAlunos(Aluno aluno) {
		alunos.add(aluno);
		System.out.println("Aluno cadastrado com sucesso.");
	}

	public boolean pesquisarAluno(String nome) {
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			if (aluno.getNome().equals(nome)) {
				System.out.println("Aluno(a) encontrado: " + aluno.getNome());
				return true;
			}
		}
		System.out.println("Aluno(a) não encontrado: " + nome);
		return false;
	}

	public void atualizarAluno(int id) {
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			if (aluno.getId() == id) {
				System.out.println("Nome: ");
				String nome = sc.next();
				aluno.setNome(nome);
				System.out.println("Idade: ");
				int idade = sc.nextInt();
				aluno.setIdade(idade);
				System.out.println("Dados atualizados");
			}
		}
		//System.out.println("Aluno(a) não encontrado");
	}

	public void deletarAluno(int id) {
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			if (aluno.getId() == id) {
				alunos.remove(aluno);
				System.out.println("Aluno(a) deletado com sucesso");
			}
		}
		//System.out.println("Aluno(a) não encontrado");
	}

	public void imprimirAlunos() {
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Alunos(a): " + alunos.get(i).getNome());
		}
	}

}