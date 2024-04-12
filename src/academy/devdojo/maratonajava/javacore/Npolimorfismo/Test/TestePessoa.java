package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.PessoaFisica;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.PessoaJuridica;

public class TestePessoa {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Higor");
        pessoaFisica.setCpf("092.968.896-18");
        pessoaFisica.getNome();
        System.out.println(pessoaFisica.getNome());

        System.out.println("----------------");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Rangel Store");
        pessoaJuridica.setCnpj("24.163.706.0001-32");
        pessoaJuridica.getNome();
        System.out.println(pessoaJuridica.getNome());

    }
}
