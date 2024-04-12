package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraAmigos {
    public static void imprime (Amigos amigos){
        System.out.println("------------------");

        System.out.println(amigos.name);
        System.out.println(amigos.age);
        System.out.println(amigos.sex);
        System.out.println(amigos.height);
        System.out.println(amigos.weight);

    }
}
