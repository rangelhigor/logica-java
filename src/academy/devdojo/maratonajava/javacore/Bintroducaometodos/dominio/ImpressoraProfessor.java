package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraProfessor {
    public static void imprime(Professor professor) {
        System.out.println("---------------------");

        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.sex);

    }
}
