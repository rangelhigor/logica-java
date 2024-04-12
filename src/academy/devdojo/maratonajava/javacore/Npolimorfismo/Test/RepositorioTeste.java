package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.RepositorioMemoria;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
