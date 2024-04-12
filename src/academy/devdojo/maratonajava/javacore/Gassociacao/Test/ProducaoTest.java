package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Ator;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Diretor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Filme;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Lugar;

public class ProducaoTest {
    public static void main(String[] args) {
        Ator atores = new Ator("Al Pacino", 83);
        Filme filmes = new Filme("Scarface");
        Diretor diretor = new Diretor("Brian De Palma", "suspense");
        Lugar lugar = new Lugar("Cinema", "Nova Iorque");

        diretor.setEspecialidade(diretor.getEspecialidade());
        diretor.imprime();

    }
}
