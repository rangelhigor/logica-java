package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Banda {
    private String nome;
    private Membro[] membros;

    public Banda(String nome) {
        this.nome = nome;
    }

    public Banda(String nome, Membro[] membros){
        this.nome = nome;
        this.membros = membros;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (membros == null) return;
        for (Membro membro : membros) {
            System.out.println(membro.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Membro[] getMembros() {
        return membros;
    }

    public void setMembros(Membro[] membros) {
        this.membros = membros;
    }
}
