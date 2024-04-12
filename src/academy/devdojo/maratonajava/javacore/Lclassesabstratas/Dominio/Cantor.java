package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio;

public class Cantor extends Profissional {
    public Cantor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Cantor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
