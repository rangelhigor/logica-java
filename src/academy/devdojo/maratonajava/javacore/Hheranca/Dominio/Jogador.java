package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Jogador {
    private String nome;
    private int idade;
    private Time time;


    public void imprime(){
        System.out.println(this.getNome());
        System.out.println(this.getIdade());

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
