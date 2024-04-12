package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "1300";
        carro1.ano = 1976;
        carro1.valor = 34990D;

        carro2.nome = "Mustang Shelby";
        carro2.modelo = "GT500 CR";
        carro2.ano = 1967;
        carro2.valor = 945000;

        carro1 = carro2;

        System.out.println("Carro1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println(carro1.valor);

        System.out.println("\nCarro2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
        System.out.println(carro2.valor);

    }
}
