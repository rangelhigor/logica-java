package academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio.Carro;

public class CalcularImpostoCarro {
    public static void calcularImpostoCarro(Carro carro){
        System.out.println("Relatório de imposto por carro");
        double imposto = carro.calcularImpostoCarro();
        System.out.println("Carro: "+carro.getNome());
        System.out.println("Preço: "+carro.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
    }
}
