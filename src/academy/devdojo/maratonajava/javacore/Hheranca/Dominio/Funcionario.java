package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco inicialização de Funcionário 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de Funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagaento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


