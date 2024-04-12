package academy.devdojo.estruturascondicionais.ifselse;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 9000;
        if (salario <= 2112) {
            System.out.println("Isento");

        } else if (salario >= 2112.01 && salario <= 2826.65) {
            System.out.println("7.5% " + "Voce deverá pagar o valor de " + (salario * 0.075 + " reais "));

        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("15% " + "Voce deverá pagar o valor de " + (salario * 0.15 + " reais "));

        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22.5% " + "Voce deverá pagar o valor de " + (salario * 0.225 + " reais "));

        } else {
            System.out.println("27,5% " + "Voce deverá pagar o valor de " + (salario * 0.275 + " reais "));

        }
    }
}

