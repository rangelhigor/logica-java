package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.*;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Tenis tenis = new Tenis("Nike Janoski", 800);
        Brocolis brocolis = new Brocolis("Brocolis Japones", 10);
        Celular celular = new Celular("Iphone 12 64G RAM", 2711);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tenis);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(brocolis);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(celular);

    }
}
