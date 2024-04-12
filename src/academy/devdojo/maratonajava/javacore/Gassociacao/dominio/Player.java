package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Player {
    private String name;
    private Team team;

    public void imprime() {
        System.out.println(this.name);
        if (team == null) {
            System.out.println(getTeam());
    }
}

public Player(String name) {
    this.name = name;
}

public Team getTeam() {
    return team;
}

public void setName(String name) {
    this.name = name;

    }
}





