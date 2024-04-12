package academy.devdojo.maratonajava.javacore.KEnum.Dominio;

public enum TipoProfissional {
    DESENVOLVEDOR(1), ADVOGADO(2),
    PINTOR(3);

    public final int valor;


    TipoProfissional(int valor) {
        this.valor = valor;

    }

}
