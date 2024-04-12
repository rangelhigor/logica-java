package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Higor");
        Player player2 = new Player("Rangel");
        Player player3 = new Player("BOT");
        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.imprime();
        }
    }
}
