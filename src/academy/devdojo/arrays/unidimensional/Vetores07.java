package academy.devdojo.arrays.unidimensional;

public class Vetores07 {
    public static void main(String[] args) {
        double[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] array2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] somaDosArrays = new double[10];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                somaDosArrays[j] = array1[i] + array2[j];
            }
            System.out.println("A soma dos valores é: ");
            System.out.println(somaDosArrays[i] + " ");
        }
    }
}
