package academy.devdojo.variaveis;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Digite a sua altura: ");
        float altura = teclado.nextInt();
        System.out.println("Digite o seu peso: ");
        float peso = teclado.nextInt();
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: " + idade);
        System.out.println("A altura digitada foi: " + altura);
        System.out.println("O peso digitado foi: " + peso);
    }
}
