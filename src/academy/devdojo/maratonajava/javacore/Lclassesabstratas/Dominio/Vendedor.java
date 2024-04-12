package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio;

public abstract class Vendedor {
    protected String nome;
    protected double salario;

    public Vendedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}


