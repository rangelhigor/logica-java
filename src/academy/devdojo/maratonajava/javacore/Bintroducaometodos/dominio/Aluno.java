package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private char sexo;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        if (sexo != 'M' && sexo != 'F') {
            System.out.println("Sexo inválido");
            return;
        }
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }
}


