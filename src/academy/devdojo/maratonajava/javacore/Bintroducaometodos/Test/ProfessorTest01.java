package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraProfessor;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        Professor professor02 = new Professor();
        ImpressoraProfessor imprime = new ImpressoraProfessor();

        professor01.name = "João";
        professor01.age = 42;
        professor01.sex = 'M';

        professor02.name = "Joana";
        professor02.age = 55;
        professor02.sex = 'F';

        ImpressoraProfessor.imprime(professor01);
        ImpressoraProfessor.imprime(professor02);

    }
}
