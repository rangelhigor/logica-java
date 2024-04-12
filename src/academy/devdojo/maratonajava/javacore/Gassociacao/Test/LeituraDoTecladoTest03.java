package academy.devdojo.maratonajava.javacore.Gassociacao.Test;


import java.util.Scanner;

public class LeituraDoTecladoTest03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        System.out.println("Digite sua idade");
        String pergunta = teclado.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Nome e idade correta");
        } else {
            System.out.println("Nome e idade incorreta");
        }
    }
}
