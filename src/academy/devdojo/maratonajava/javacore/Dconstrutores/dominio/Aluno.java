package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private char sexo;
    private int altura;
    private int peso;
    private String endereco;


    public Aluno(String nome, int idade, char sexo) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Aluno(String nome, int idade, char sexo, int altura) {
        this(nome, idade, sexo);
        this.altura = altura;
    }

    public Aluno(String nome, int idade, char sexo, int altura, int peso) {
        this(nome, idade, sexo, altura);
        this.peso = peso;

    }

    public Aluno(String nome, int idade, char sexo, int altura, int peso, String endereco) {
        this(nome, idade, sexo, altura, peso);
        this.endereco = endereco;

    }

    public Aluno() {

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.altura);
        System.out.println(this.peso);
        System.out.println(this.endereco);
    }
}

