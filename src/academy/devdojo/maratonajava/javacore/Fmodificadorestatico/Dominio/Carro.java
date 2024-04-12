package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Dominio;

public class Carro {
    public String nome;
    public double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("----------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite " + this.velocidadeLimite);
    }
    public static void setVelocidadeLimite(double velocidadeLimite){


    }


    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima() {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
