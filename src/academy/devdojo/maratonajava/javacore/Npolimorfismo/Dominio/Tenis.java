package academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio;

public class Tenis extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.15;

    public Tenis(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tenis");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
