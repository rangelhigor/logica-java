package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio.Peixeiro;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.Dominio.Sapateiro;


public class VendedorTest01 {
    public static void main(String[] args) {
        Peixeiro peixeiro = new Peixeiro("Eduardo", 3000);
        Sapateiro sapateiro = new Sapateiro("Joaquim", 4000);
        System.out.println(peixeiro);
        System.out.println(sapateiro);
    }
}
