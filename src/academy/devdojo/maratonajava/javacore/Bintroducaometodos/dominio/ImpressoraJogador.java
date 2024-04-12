package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraJogador {
    public void impressoraJogador (Jogador jogador){
        System.out.println("-----------------");

        System.out.println(jogador.nome);
        System.out.println(jogador.idade);
        System.out.println(jogador.sexo);
        System.out.println(jogador.posicao);
        System.out.println(jogador.altura);
        System.out.println(jogador.peso);

    }
}
