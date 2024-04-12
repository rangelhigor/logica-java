package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Diretor {
    private String nome;
    private String especialidade;


    public Diretor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;

    }

    public void imprime(){
        System.out.println("-----------");
        System.out.println("Filme: " +this.nome);
        System.out.println("Diretor: " + this.nome);
        System.out.println("Ator: " + this.nome);
        System.out.println("Lugar: "+this.nome);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}

