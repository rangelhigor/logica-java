package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private char sexo;
    private float altura;
    private float peso;
    private String dataNascimento;
    private String email;
    private String cpf;
    private String endereco;


    public void init(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void init(String nome, int idade, char sexo, float altura, float peso, String dataNascimento, String email, String cpf, String endereco) {
        this.init(nome, idade, sexo);
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.altura);
        System.out.println(this.peso);
        System.out.println(this.dataNascimento);
        System.out.println(this.email);
        System.out.println(this.cpf);
        System.out.println(this.endereco);
    }
}

