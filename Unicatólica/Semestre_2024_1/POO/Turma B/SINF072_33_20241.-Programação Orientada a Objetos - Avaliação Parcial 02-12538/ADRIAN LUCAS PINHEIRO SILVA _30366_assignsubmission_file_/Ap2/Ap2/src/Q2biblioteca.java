public class Q2biblioteca {
    interface ItemBiblioteca {
        void emprestarItem();
        void devolverItem();
    }
    interface Livro extends ItemBiblioteca {
        boolean consultarDisponibilidade();
    }
    interface DVD extends ItemBiblioteca {
        void gravarDVD();
    }
    class LivroImpresso implements Livro {
        private String titulo;
        private String autor;
        private boolean disponivel;
    
        public LivroImpresso(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = true; // Inicialmente, o livro está disponível
        }
        public void emprestarItem() {
            if (disponivel) {
                disponivel = false;
                System.out.println("O livro \"" + titulo + "\" foi emprestado.");
            } else {
                System.out.println("O livro \"" + titulo + "\" não está disponível para empréstimo.");
            }
        }
        public void devolverItem() {
            disponivel = true;
            System.out.println("O livro \"" + titulo + "\" foi devolvido.");
        }
        public boolean consultarDisponibilidade() {
            return disponivel;
        }
    
        public void exibirDetalhes() {
            System.out.println("Livro:\nTítulo: " + titulo + "\nAutor: " + autor + "\nDisponível: " + (disponivel ? "Sim" : "Não"));
        }
    }
    class DVD implements DVD {
        private String titulo;
        private String diretor;
        private boolean disponivel;
    
        public DVD(String titulo, String diretor) {
            this.titulo = titulo;
            this.diretor = diretor;
            this.disponivel = true;
        }
        public void emprestarItem() {
            if (disponivel) {
                disponivel = false;
                System.out.println("O DVD \"" + titulo + "\" foi emprestado.");
            } else {
                System.out.println("O DVD \"" + titulo + "\" não está disponível para empréstimo.");
            }
        }
        public void devolverItem() {
            disponivel = true;
            System.out.println("O DVD \"" + titulo + "\" foi devolvido.");
        }
        public void gravarDVD() {
            System.out.println("Gravando conteúdo no DVD \"" + titulo + "\".");
        }
    
        public void exibirDetalhes() {
            System.out.println("DVD:\nTítulo: " + titulo + "\nDiretor: " + diretor + "\nDisponível: " + (disponivel ? "Sim" : "Não"));
        }
    }
    public class Main {
        public static void main(String[] args) {
            LivroImpresso livro = new LivroImpresso("1984", "George Orwell");
            DVD dvd = new DVD("O Poderoso Chefão", "Francis Ford Coppola");
    
            livro.exibirDetalhes();
            dvd.exibirDetalhes();
            
            System.out.println();
            if (livro.consultarDisponibilidade()) {
                livro.emprestarItem();
            }
            if (dvd.consultarDisponibilidade()) {
                dvd.emprestarItem();
            }
    
            System.out.println();
            livro.exibirDetalhes();
            dvd.exibirDetalhes();
            
            System.out.println();
            livro.devolverItem();
            dvd.devolverItem();
    
            System.out.println();
            livro.exibirDetalhes();
            dvd.exibirDetalhes();
            
            System.out.println();
            dvd.gravarDVD();
        }
    }

}
