package revisao1;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public void imprimirInformacoes() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Matrícula: "+this.matricula);
		System.out.println("Curso: "+this.curso);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
