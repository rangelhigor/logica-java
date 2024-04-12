package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Jogo {
    private String nome;
    private String tipo;
    private String genero;
    private String versao;
    private String plataforma;


    public void init(String nome, String tipo, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
    }

    public void init(String nome, String tipo, String genero, String versao) {
        this.init(nome, tipo, genero);
        this.versao = versao;

    }

    public void init(String nome, String tipo, String genero, String versao, String plataforma) {
        this.init(nome, tipo, genero, versao);
        this.plataforma = plataforma;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.versao);
        System.out.println(this.plataforma);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo() {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
