package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.BMW;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.Carro;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.Gol;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.Uno;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.CalcularImpostoCarro;

public class CarroTest01 {
    public static void main(String[] args) {
        Gol carro1 = new Gol("Gol 1.0 12V FLEX MANUAL", 54900);
        Uno carro2 = new Uno("Fiat Uno 1.0 8V FLEX MANUAL", 31900);
        BMW carro3 = new BMW("BMW X6 3.0 SPORT AUTOMÁTICO", 789000);

        CalcularImpostoCarro.calcularImpostoCarro(carro1);
        System.out.println("---------------------");
        CalcularImpostoCarro.calcularImpostoCarro(carro2);
        System.out.println("-------------------------");
        CalcularImpostoCarro.calcularImpostoCarro(carro3);
    }
}
