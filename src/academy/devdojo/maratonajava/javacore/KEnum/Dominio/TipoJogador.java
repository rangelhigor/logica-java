package academy.devdojo.maratonajava.javacore.KEnum.Dominio;

public enum TipoJogador {
    MEIO_CAMPISTA(1),
    ATACANTE(2),
    GOLEIRO (3);

    public final int valor;

    TipoJogador(int valor) {
        this.valor = valor;
    }
}
