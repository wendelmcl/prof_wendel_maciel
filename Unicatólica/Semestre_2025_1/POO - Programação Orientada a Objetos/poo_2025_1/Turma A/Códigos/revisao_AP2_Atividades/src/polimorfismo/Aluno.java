package polimorfismo;

public class Aluno extends Pessoa{
	private String nomeCurso;
	
	public Aluno(String nome, int idade, String nomeCurso) {
		super(nome, idade);
		this.nomeCurso = nomeCurso;
	}
	
	public void mostraDados() {
		System.out.println("Nome do aluno(a): "+getNome()+""
				+ "\nIdade do aluno(a): "+getIdade()+""
				+ "\nCurso do aluno(a): "+nomeCurso);
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
}
