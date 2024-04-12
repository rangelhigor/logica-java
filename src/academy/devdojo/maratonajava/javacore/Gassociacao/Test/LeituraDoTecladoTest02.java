package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = teclado.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
     }else{
            System.out.println("NÃO");
        }
    }
}
