package academy.devdojo.maratonajava.javacore.Minterfaces.Dominio;

public class BasedadosCarregar implements Carregando{
    @Override
    public void carregando() {
        System.out.println("Carregando banco de dados..");
    }
}
