package academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio;

public abstract class Carro implements Taxa {
    protected String nome;
    protected double valor;

    public Carro(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
