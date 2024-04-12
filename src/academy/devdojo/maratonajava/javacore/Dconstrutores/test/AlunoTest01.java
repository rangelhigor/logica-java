package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Higor", 31, 'M', 173, 73, "Av Joao da Silva 841");
        aluno.imprime();

    }
}
