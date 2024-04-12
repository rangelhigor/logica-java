package academy.devdojo.maratonajava.javacore.KEnum.Dominio;

public class Jogador {
    public enum TipoPosicao {
        MEIO_CAMPISTA, ATACANTE, GOLEIRO
    }

    private String nome;
    private TipoPosicao tipoPosicao;

    public Jogador(String nome, TipoPosicao tipoPosicao) {
        this.nome = nome;
        this.tipoPosicao = tipoPosicao;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", tipoPosicao=" + tipoPosicao +
                '}';
    }
}
