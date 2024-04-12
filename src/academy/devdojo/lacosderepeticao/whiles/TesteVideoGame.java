package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class TesteVideoGame {
    public static void main(String[] args) {
        int menu = 0;
        Scanner teclado = new Scanner(System.in);
        while (menu != 3){
            System.out.println("1. New Game");
            System.out.println("2. Load Game");
            System.out.println("3. Exit Game");
            System.out.println("Escolha sua opção");
            menu = teclado.nextInt();
        }
        System.out.println("Fim de programa");
    }
}
