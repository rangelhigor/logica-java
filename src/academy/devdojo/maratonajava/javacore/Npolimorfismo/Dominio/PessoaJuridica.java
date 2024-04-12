package academy.devdojo.maratonajava.javacore.Npolimorfismo.Dominio;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return "Pessoa Jurídica: " + super.getNome() + " - CNPJ:" + this.getCnpj();
    }

}

