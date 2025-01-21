package q2;

public class LivroImpresso extends Livro {
	 private String titulo;

	 public LivroImpresso(String titulo) {
	     this.titulo = titulo;
	 }

	 @Override
	 public boolean consultarDisponibilidade() {
	     return isDisponivel();
	 }

	 public String getTitulo() {
	     return titulo;
	 }
	}
