package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Romário");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---- Jogador ---");

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();

        System.out.println("--- Time ---");

        time.imprime();

    }
}
