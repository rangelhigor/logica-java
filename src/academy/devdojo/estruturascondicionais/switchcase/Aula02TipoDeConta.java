package academy.devdojo.estruturascondicionais.switchcase;

import java.sql.SQLOutput;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        String conta = "CONTA_POUPANCA";
        switch (conta) {
            case "CONTA_POUPANCA":
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("CONTA INVÁLIDA");
        }
        System.out.println("Fim do Programa");

    }
}