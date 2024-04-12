package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Treinador extends Jogador {
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
