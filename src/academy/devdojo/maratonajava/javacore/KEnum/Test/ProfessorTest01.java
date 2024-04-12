package academy.devdojo.maratonajava.javacore.KEnum.Test;

import academy.devdojo.maratonajava.javacore.KEnum.Dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Mauro", Professor.TipoProfessor.PROFESSOR_INGLES);
        Professor professor2 = new Professor("Joana", Professor.TipoProfessor.PROFESSOR_MATEMATICA);
        Professor professor3 = new Professor("Luís", Professor.TipoProfessor.PROFESSOR_PORTUGUES);

        System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(professor3);

    }

}
