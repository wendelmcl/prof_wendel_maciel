package exemplo2;

public interface Pessoa {
	String nome = "";
	int idade = 0;
	
	int incrementarIdade();
	void mostrarInformações();
	
	void setNome(String nome);
	void setIdade(int idade);
	
	String getNome();
	int getIdade();
}
