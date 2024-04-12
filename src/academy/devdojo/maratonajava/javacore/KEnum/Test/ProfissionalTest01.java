package academy.devdojo.maratonajava.javacore.KEnum.Test;

import academy.devdojo.maratonajava.javacore.KEnum.Dominio.Profissionais;


public class ProfissionalTest01 {
    public static void main(String[] args) {
        Profissionais profissional1 = new Profissionais("Higor", 31, Profissionais.TipoProfissional.DESENVOLVEDOR);
        Profissionais profissional2 = new Profissionais("Roberto", 42, Profissionais.TipoProfissional.ADVOGADO);
        Profissionais profissional3 = new Profissionais("Jairo", 61, Profissionais.TipoProfissional.PINTOR);

        System.out.println(profissional1);
        System.out.println(profissional2);
        System.out.println(profissional3);

    }
}
