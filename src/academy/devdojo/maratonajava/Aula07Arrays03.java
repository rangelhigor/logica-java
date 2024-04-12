package academy.devdojo.maratonajava;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {5, 5, 5, 5, 5};
        int[] numeros2 = {17, 21, 35, 77, 49};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int num : numeros) {
            System.out.println(num);
            num = numeros3[0];
            System.out.println(num);
            num = numeros3[1];
            System.out.println(num);
            num = numeros3[2];
            System.out.println(num);

        }
    }
}

