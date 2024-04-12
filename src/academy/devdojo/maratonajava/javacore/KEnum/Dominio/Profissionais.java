package academy.devdojo.maratonajava.javacore.KEnum.Dominio;

public class Profissionais {
    public enum TipoProfissional {
        DESENVOLVEDOR, ADVOGADO, PINTOR
    }

    private String nome;
    private int idade;
    private TipoProfissional tipoProfissional;


    public Profissionais(String nome, int idade, TipoProfissional tipoProfissional) {
        this.nome = nome;
        this.idade = idade;
        this.tipoProfissional = tipoProfissional;
    }

    @Override
    public String toString() {
        return "Profissionais{" +
                "nome='" + nome + '\'' +
                ", tipoProfissional=" + tipoProfissional +
                '}';
    }
}


