package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Jogador01;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador01 jogador01 = new Jogador01();
        jogador01.nome = "Higor";
        jogador01.idade = 31;
        jogador01.salarios = new double[]{500};

        jogador01.imprime();


    }
}
