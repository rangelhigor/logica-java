package academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return "Pessoa Física: " + super.getNome() + " - CPF:" + this.getCpf();
    }
}
