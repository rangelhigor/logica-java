package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Jogo;

public class JogoTest01 {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.init("Counter-Strike", "Videogame/Primeira Pessoa", "Ação/Tiro", "2.0", "Microsoft/Linux");
        jogo.imprime();
    }
}
