package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraJogador;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        ImpressoraJogador impressoraJogador = new ImpressoraJogador();

        jogador1.nome = "Cristiano Ronaldo";
        jogador1.idade = 39;
        jogador1.sexo = 'M';
        jogador1.posicao = "Atacante";
        jogador1.altura = 187;
        jogador1.peso = 83;

        jogador2.nome = "Messi";
        jogador2.idade = 36;
        jogador2.sexo = 'M';
        jogador2.posicao = "Atacante";
        jogador2.altura = 169;
        jogador2.peso = 72;

        impressoraJogador.impressoraJogador(jogador1);
        impressoraJogador.impressoraJogador(jogador2);


    }
}
