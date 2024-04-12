package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.Dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.Dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
