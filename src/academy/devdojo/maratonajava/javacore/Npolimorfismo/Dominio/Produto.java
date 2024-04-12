package academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;
    protected String dataValidade;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}

