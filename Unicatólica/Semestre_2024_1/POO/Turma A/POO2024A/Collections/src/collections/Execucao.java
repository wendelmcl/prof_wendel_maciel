package collections;

public class Execucao {

	public static void main(String[] args) {
		AlunoArray aa = new AlunoArray();
		Aluno a1 = new Aluno();
		a1.setId(1);
		a1.setNome("Ana");
		a1.setIdade(30);
		
		Aluno a2 = new Aluno();
		a2.setId(2);
		a2.setNome("Carlos");
		a2.setIdade(50);
		
		aa.cadastrarAlunos(a1);
		aa.cadastrarAlunos(a2);
		aa.imprimirAlunos();
		aa.pesquisarAluno("Maria");
		aa.pesquisarAluno("Ana");
		aa.atualizarAluno(2);
		aa.imprimirAlunos();
		aa.deletarAluno(2);
		aa.imprimirAlunos();
	}
}