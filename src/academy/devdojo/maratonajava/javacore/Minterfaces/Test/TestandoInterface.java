package academy.devdojo.maratonajava.javacore.Minterfaces.Test;

import academy.devdojo.maratonajava.javacore.Minterfaces.Dominio.BasedadosCarregar;
import academy.devdojo.maratonajava.javacore.Minterfaces.Dominio.ClasseDeTeste;

public class TestandoInterface {
    public static void main(String[] args) {
        BasedadosCarregar basedados = new BasedadosCarregar();
        ClasseDeTeste classeDeTeste = new ClasseDeTeste();
        classeDeTeste.carregando();
        basedados.carregando();
    }
}
