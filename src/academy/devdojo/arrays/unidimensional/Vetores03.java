package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Vetores03 {
    public static void main(String[] args) {
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] vetor3 = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Vetor 1, posição " + i + " ");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Vetor 2, posição " + i + " ");
            vetor2[i] = scanner.nextInt();
        }
        System.out.println("Soma dos vetores");
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.println(vetor3[i] + " ");

        }
    }
}

