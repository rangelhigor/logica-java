package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio;

public class Sapateiro extends Vendedor {
    public Sapateiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Sapateiro{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
