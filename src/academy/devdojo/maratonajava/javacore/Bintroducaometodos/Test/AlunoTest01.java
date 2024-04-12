package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Higor");
        aluno.setIdade(31);
        aluno.setSexo('M');
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getSexo());
    }
}
