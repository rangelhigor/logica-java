package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Banda;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Membro;

public class BandaTest01 {
    public static void main(String[] args) {
        Membro membro1 = new Membro("Chester Bennington");
        Membro membro2 = new Membro("Mike Shinoda");
        Membro membro3 = new Membro("Joe Hahn");
        Membro membro4 = new Membro("Brad Delson");
        Membro membro5 = new Membro("Dave Farrell");
        Membro membro6 = new Membro("Rob Bourdon");
        Membro[] membro = {membro1, membro2, membro3, membro4, membro5, membro6};
        Banda banda = new Banda("Linkin Park");
        banda.setMembros(membro);
        banda.getMembros();

            banda.imprime();

        }
    }



