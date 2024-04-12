package academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio;

public class Brocolis extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;

    public Brocolis(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
