package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade");
        String pergunta = input.nextLine();
        int idade = ' ';
        if (idade >= 18) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada não permitida");
        }
    }
}
