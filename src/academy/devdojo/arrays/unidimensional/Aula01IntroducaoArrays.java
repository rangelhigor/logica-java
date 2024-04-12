package academy.devdojo.arrays.unidimensional;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 9.8;
        double nota2 = 7.6;
        double nota3 = 4.5;
        double nota4 = 6;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
        double[] notas = new double[4];
        System.out.println("--------------------");
        notas[0] = 9.8;
        notas[1] = 7.6;
        notas[2] = 4.5;
        notas[3] = 6;

        System.out.println("Tamanho do array: " +notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);

        }
    }
}
