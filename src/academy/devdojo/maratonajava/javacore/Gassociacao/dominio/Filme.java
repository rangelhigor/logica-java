package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Filme {
    private String titulo;
    private Ator[] atores;
    private Lugar lugar;

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public Filme(String titulo, Ator[] atores, Lugar lugar) {
        this.titulo = titulo;
        this.atores = atores;
        this.lugar = lugar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Ator[] getAtores() {
        return atores;
    }

    public void setAtores(Ator[] atores) {
        this.atores = atores;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
}