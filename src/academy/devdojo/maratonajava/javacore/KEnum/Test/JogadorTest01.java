package academy.devdojo.maratonajava.javacore.KEnum.Test;

import academy.devdojo.maratonajava.javacore.KEnum.Dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Vinicius JR", Jogador.TipoPosicao.ATACANTE);
        Jogador jogador2 = new Jogador("Toni Kroos", Jogador.TipoPosicao.MEIO_CAMPISTA);
        Jogador jogador3 = new Jogador("Luka Modric", Jogador.TipoPosicao.MEIO_CAMPISTA);
        Jogador jogador4 = new Jogador("Thibaut Courtois", Jogador.TipoPosicao.GOLEIRO);
        Jogador jogador5 = new Jogador("Rodrygo", Jogador.TipoPosicao.ATACANTE);

        System.out.println(jogador1);
        System.out.println(jogador2);
        System.out.println(jogador3);
        System.out.println(jogador4);
        System.out.println(jogador5);

    }
}
