package q2;

public class DVD2 extends DVD {
	 private String titulo;

	 public DVD2(String titulo) {
	     this.titulo = titulo;
	 }
	 public void gravarDVD() {
	     System.out.println("Gravando DVD " + titulo + "...");
	 }

	 public String getTitulo() {
	     return titulo;
	 }
	}
