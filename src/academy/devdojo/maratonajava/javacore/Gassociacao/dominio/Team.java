package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import javax.naming.Name;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
