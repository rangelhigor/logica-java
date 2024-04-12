package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio.Advogado;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio.Biologo;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio.Cantor;

public class ProfissionalTest01 {
    public static void main(String[] args) {
        Advogado advogado = new Advogado("Fulano", 8000);
        Biologo biologo = new Biologo("Jessica", 5000);
        Cantor cantor = new Cantor("Danny Worsnop",1500000);
        System.out.println(advogado);
        System.out.println(biologo);
        System.out.println(cantor);
    }
}
