package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Ator {
    private String nome;
    private Ator[] atores;
    private int idade;


    public Ator(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

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

}


