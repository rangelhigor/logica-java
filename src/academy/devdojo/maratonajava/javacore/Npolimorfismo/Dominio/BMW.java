package academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio;

public class BMW extends Carro{
    public static final double IMPOSTO_POR_CENTO = 0.60;
    public BMW(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostoCarro() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
