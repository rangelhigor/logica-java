package academy.devdojo.maratonajava.javacore.KEnum.Dominio;

public class Professor {
    public enum TipoProfessor{
        PROFESSOR_INGLES, PROFESSOR_PORTUGUES,
        PROFESSOR_MATEMATICA
    }
    private String nome;
    private TipoProfessor tipoProfessor;

    public Professor(String nome, TipoProfessor tipoProfessor) {
        this.nome = nome;
        this.tipoProfessor = tipoProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", tipoProfessor=" + tipoProfessor +
                '}';
    }
}
