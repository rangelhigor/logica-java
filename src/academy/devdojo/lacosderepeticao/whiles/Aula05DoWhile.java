package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
       int desejaContinuar = 1;
       Scanner scanner = new Scanner(System.in);
       do {
           System.out.println("PLAYER 1: Digite num número de 1 a 10");
           int num1 = scanner.nextInt();
           System.out.println("PLAYER 1: Digite num número de 1 a 10");
           int num2 = scanner.nextInt();
           System.out.println("Acertou "+ (num1  == num2));
           System.out.println("-----------------------------------------");
           System.out.println("Deseja Continuar Jogando?");
           System.out.println("1. Sim");
           System.out.println("2. Não");
           desejaContinuar = scanner.nextInt();
       }while (desejaContinuar == 1);
    }
}
