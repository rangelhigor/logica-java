package academy.devdojo.arrays.unidimensional;

public class Vetores04 {
    public static void main(String[] args) {
        double[] Vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        double[] Vetor2 = {2, 3, 4, 5, 6, 7, 8, 9, 0,};
        double[] VetorMultiplicado = new double[9];
        for (int i = 0; i < Vetor1.length; i++) {
            for (int j = 0; j < Vetor2.length; j++) {
                VetorMultiplicado[j] = Vetor1[i] * Vetor2[j];
            }
            System.out.println(VetorMultiplicado[i] + " ");
        }

    }

}

