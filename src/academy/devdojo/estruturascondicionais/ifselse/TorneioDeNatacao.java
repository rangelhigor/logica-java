package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite a idade do participante: ");
        int idade = teclado.nextInt();
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada do participante foi: " + idade);
        if (idade <= 10) {
            System.out.println(nome + " Participará do Torneio na Categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participará do Torneio na Categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participará do Torneio na Categoria Pré-Adulto");
        } else {
            System.out.println(nome + " Participará do Torneio na Categoria Adulto");
        }

    }

}
