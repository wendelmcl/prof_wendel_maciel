package Q4;

/* Desenvolva um sistema de cadastro de clientes em Java ultilizando POO. Crie uma classe Cliente com os atributos nome (String), idade (int) e email (String). Implemente métodos para definir e obter o valor dos atributos, seguindo o conceito de encapsulamento. Em seguida, crie um programa em Java que permita ao usuário cadastrar novos clientes, consultar os dados de um cliente especifico e exibir a lista de clientes cadastrados. */

public class Cliente {
    private String nome;
    private int idade;
    private String email;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        if (email.contains("@")) {
            this.email = email;
        }
    }

    
}
