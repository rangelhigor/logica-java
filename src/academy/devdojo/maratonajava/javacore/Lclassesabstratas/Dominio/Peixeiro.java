package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio;

public class Peixeiro extends Vendedor {
    public Peixeiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Peixeiro{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
