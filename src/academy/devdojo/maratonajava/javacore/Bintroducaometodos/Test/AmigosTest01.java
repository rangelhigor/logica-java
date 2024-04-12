package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Amigos;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraAmigos;

public class AmigosTest01 {
    public static void main(String[] args) {
        Amigos amigos01 = new Amigos();
        Amigos amigos02 = new Amigos();

        ImpressoraAmigos imprime = new ImpressoraAmigos();

        amigos01.name = "Higor";
        amigos01.age = 31;
        amigos01.sex = 'M';
        amigos01.height = 173;
        amigos01.weight = 73;

        amigos02.name = "Sarah";
        amigos02.age = 24;
        amigos02.sex = 'F';
        amigos02.height = 159;
        amigos02.weight = 64;

        ImpressoraAmigos.imprime(amigos01);
        ImpressoraAmigos.imprime(amigos02);

    }
}
