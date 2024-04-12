package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[9];
        int[] v2 = new int[9];
        int[] vr = new int[9];
        for(int i = 0; i < v1.length; i++) {
            System.out.println("Informe o " +(i + 1) + "O Valor Do Primeiro Vetor");
            v1[i] = scanner.nextInt();
            System.out.println("Informe o " +(i + 1) + "O Valor Do Segundo Vetor");
            v2[i] = scanner.nextInt();
            vr[i] = v1[i] * v2[i];
            System.out.println(v1[i] + "X" + v2[i] + " = " + vr[i]);
        }

    }
}
