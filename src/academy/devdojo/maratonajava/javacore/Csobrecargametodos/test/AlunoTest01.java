package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.init("Higor", 31, 'M', 173, 73, "25/11/1992", "higor_rangel@hotmail.com", "000.000.000-00", "Av Dr José Marçal Neto");
        aluno.imprime();
    }
}
