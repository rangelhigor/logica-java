package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        int[] array4 = new int[3];
        int[] array5 = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição  " + i + ": ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Vetor 2, posição  " + i + ": ");
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println("Vetor 3, posição " + i + ": ");
            array3[i] = scanner.nextInt();
        }
        for (int i = 0; i < array4.length; i++) {
            System.out.println("Vetor 4, posição " + i + ": ");
            array4[i] = scanner.nextInt();
        }
        System.out.println("Vetor 5 Multiplicado");
        for (int i = 0; i < array5.length; i++) {
            array5[i] = array1[i] * array2[i] * array3[i] * array4[i];
            System.out.print(array5[i] + " ");
        }

    }
}





