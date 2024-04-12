package academy.devdojo.maratonajava;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (annualSalary <= 34712) {
            valorImposto = annualSalary * primeiraFaixa;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            valorImposto = annualSalary * segundaFaixa;
        } else {
            valorImposto = annualSalary * terceiraFaixa;
        }
        System.out.println("You have to pay " + valorImposto + " from taxes");
    }

}






