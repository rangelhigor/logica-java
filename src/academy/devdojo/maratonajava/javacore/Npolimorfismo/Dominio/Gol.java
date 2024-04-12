package academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio;

public class Gol extends Carro {
    public static final double IMPOSTO_POR_CENTO = 0.30;

    public Gol(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostoCarro() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}

