package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.Funcionario;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Desenvolvedor("Gustavo", 8000);
        System.out.println(funcionario);
    }
}
