public class Produto {
    private int codigo;
    private String descricao;
    private double peso;

    public Produto(int codigo, String descricao, double peso) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", peso=" + peso +
                '}';
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Pizza Margherita", 0.5);

        System.out.println("Informações do Produto:");
        System.out.println("Código: " + produto1.getCodigo());
        System.out.println("Descrição: " + produto1.getDescricao());
        System.out.println("Peso: " + produto1.getPeso() + " kg");
    }
}
