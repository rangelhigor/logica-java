package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-850");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-------------");

        funcionario.imprime();

    }
}
