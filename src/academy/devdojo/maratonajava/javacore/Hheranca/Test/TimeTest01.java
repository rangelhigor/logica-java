package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Time;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Treinador;

public class TimeTest01 {
    public static void main(String[] args) {
        Time time = new Time();
        time.setPosicao("Atacante");
        time.setClube("Real Madrid");
        Jogador jogador = new Jogador();
        jogador.setNome("Vinicius Júnior");
        jogador.setIdade(23);
        jogador.imprime();

        Treinador treinador = new Treinador();
        treinador.setNome("Carlo Ancelotti");
        treinador.setIdade(64);
        treinador.setSalario(650000);
        System.out.println("-------------");


        treinador.imprime();

    }
}
