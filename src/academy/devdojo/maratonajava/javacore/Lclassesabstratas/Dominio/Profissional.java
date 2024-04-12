package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio;

public abstract class Profissional {
    protected String nome;
    protected double salario;

    public Profissional(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
