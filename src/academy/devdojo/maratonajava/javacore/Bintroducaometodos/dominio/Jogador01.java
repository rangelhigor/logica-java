package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Jogador01 {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
    }

    public void mediaSalario() {
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("A media salarial é " + media);
    }
}



