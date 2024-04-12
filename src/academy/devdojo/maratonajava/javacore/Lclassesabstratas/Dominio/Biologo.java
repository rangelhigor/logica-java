package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio;

public class Biologo extends Profissional {
    public Biologo(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Biologo{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
