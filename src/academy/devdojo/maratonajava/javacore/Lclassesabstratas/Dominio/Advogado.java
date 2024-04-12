package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio;

public class Advogado extends Profissional{
    public Advogado(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Advogado{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
