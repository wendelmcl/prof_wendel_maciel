package q2;



	public class DVD implements {
	    private String titulo;
	    private boolean emprestado;

	    public dvd(String titulo) {
	        this.titulo = titulo;
	        this.emprestado = false;
	    }

	    public void emprestarItem() {
	        if (!emprestado) {
	            System.out.println("O DVD '" + titulo + "' foi emprestado.");
	            emprestado = true;
	        } else {
	            System.out.println("O DVD '" + titulo + "' já está emprestado.");
	        }
	    }

	    public void devolverItem() {
	        if (emprestado) {
	            System.out.println("O DVD '" + titulo + "' foi devolvido.");
	            emprestado = false;
	        } else {
	            System.out.println("O DVD '" + titulo + "' já está disponível na biblioteca.");
	        }
	    }

	    public void gravardvd() {
	        System.out.println("Novo DVD '" + titulo + "' foi gravado.");
	    }

	    public void adicionarCopia() {
	        System.out.println("Nova cópia do DVD '" + titulo + "' foi adicionada à biblioteca.");
	    }

}

