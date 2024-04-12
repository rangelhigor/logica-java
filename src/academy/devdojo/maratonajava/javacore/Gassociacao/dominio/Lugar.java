package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Lugar {
    private String cinema;
    private String endereco;

    public Lugar(String cinema, String endereco) {
        this.cinema = cinema;
        this.endereco = endereco;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
